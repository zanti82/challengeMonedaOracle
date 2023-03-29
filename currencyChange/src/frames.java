import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class frames extends JFrame{
   
    public void initialize(){

        /*********FORM PANNEL *************/

        JLabel valorLabel = new JLabel("INGRESE EL VALOR A CAMBIAR en COP");
        JTextField valorField = new JTextField(10);
        

        JPanel formPanel= new JPanel();
        formPanel.setLayout(new FlowLayout(1));
        formPanel.add(valorLabel);
        formPanel.add(valorField);

    /*********CURRENCY PANNEL *************/
        
        JLabel currencieslb= new JLabel("ESCOJA LA MONEDA A CAMBIAR");
        JTextField currtx= new JTextField(5);
        JComboBox currenciesBox = new JComboBox<>();
            currenciesBox.addItem("USD");
            currenciesBox.addItem("EUR");
            currenciesBox.addItem("YEN");
            currenciesBox.addItem("POUND");
            currenciesBox.addItem("WON");
            
         currenciesBox.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
               currtx.setText(currenciesBox.getSelectedItem().toString());
               System.out.println(currtx.getText());
            }
            
         });   

        JPanel currencyPanel= new JPanel();
        currencyPanel.setLayout(new FlowLayout(1) );
        currencyPanel.add(currencieslb);
        currencyPanel.add(currenciesBox);
        currencyPanel.add(currtx);


    /*********BUTTONS PANNEL *************/
        JTextField valorField2= new JTextField(5);

        JButton changeBtn= new JButton("CAMBIAR");
        changeBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                Double c=1.0;
                Double change= Double.parseDouble(valorField.getText());

                if(currenciesBox.getSelectedItem() == "USD"){
                     c = 0.00021;
                     System.out.println("ok usd");

                }
                if(currenciesBox.getSelectedItem() == "EUR"){
                    c = 0.00019;
                     System.out.println("ok EURO");
                }
                if(currenciesBox.getSelectedItem() == "YEN"){
                    c = 0.028;
                     System.out.println("ok YENES");
                }
                if(currenciesBox.getSelectedItem() == "POUND"){
                    c = 0.00017;
                     System.out.println("ok LIBRAS");
                }
                if(currenciesBox.getSelectedItem() == "WON"){
                    c = 0.27;
                     System.out.println("ok WONS");
                }
                     change= c * change;
                    valorField2.setText(String.valueOf(change));
                    System.out.println(change);
                
                /*if(currtx.getText()== "EUR"){
                     c = 5000.0;
                     change= c * change;
                    valorField2.setText(String.valueOf(change));
                    System.out.println(change);
                }*/
                
                
            }
            
        });

        JButton clearBtn= new JButton("LIMPIAR");
        clearBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                valorField.setText(" ");
                valorField2.setText(" ");

            }
            
        });

        JPanel buttonsPanel= new JPanel();
        
        buttonsPanel.setLayout(new FlowLayout(1) );
        buttonsPanel.add(changeBtn);
        buttonsPanel.add(clearBtn);
        buttonsPanel.add(valorField2);




    // ACA COY A CREAR UN PANLE CON LOS OTROS PANELES    
    JPanel mainFrame=new JPanel();
    mainFrame.setLayout(new BorderLayout());
    mainFrame.add(formPanel, BorderLayout.NORTH);
    mainFrame.add(currencyPanel, BorderLayout.CENTER);
    mainFrame.add(buttonsPanel, BorderLayout.SOUTH);

    
    //ADA ADICIONAMOS AL FRAME PRINCIPAL LOS PANELES
    add(mainFrame);




       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setTitle("CONVERSOR DE MONEDA");
       
        Toolkit screen1 = Toolkit.getDefaultToolkit();
        Dimension size= screen1.getScreenSize();
        int heightScreen = size.height;
        int widthScreen = size.width;
        setSize(widthScreen/3, heightScreen/3);
        setLocation(widthScreen/3, heightScreen/3);
        Image newIcon = screen1.getImage("challengeMonedaOracle/currencyChange/src/graficos/dinero.gif");
        setIconImage(newIcon);
    }

    public static void main(String[] args) {
        frames currency = new frames();
        currency.initialize();
    }

    
}
