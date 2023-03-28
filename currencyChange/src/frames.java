import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class frames extends JFrame{
   
    public void initialize(){

        /*********FORM PANNEL *************/

        JLabel valorLabel = new JLabel("INGRESE EL VALOR A CAMBIAR en COP");
        JTextField valorField = new JTextField(10);

        JPanel formPanel= new JPanel();
        formPanel.setLayout(new GridLayout(2,1,10,20));
        formPanel.add(valorLabel);
        formPanel.add(valorField);

    /*********CURRENCY PANNEL *************/

        JLabel currencieslb= new JLabel("ESCOJA LA MONEDA A CAMBIAR");
        JComboBox currenciesBox = new JComboBox<>();
            currenciesBox.addItem("UDS dolar");
            currenciesBox.addItem("EUR euro");
            currenciesBox.addItem("YEN japon");
            currenciesBox.addItem("POUND libra esterlina");
            currenciesBox.addItem("WON corea");

        JPanel currencyPanel= new JPanel();
        currencyPanel.setLayout(new GridLayout(2,1,5,20));
        currencyPanel.add(currencieslb);
        currencyPanel.add(currenciesBox);

    /*********BUTTONS PANNEL *************/
        JTextField valorField2= new JTextField(10);

        JButton changeBtn= new JButton("CAMBIAR");
        changeBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                Double usd=(double) 5000;
                Double change= Double.parseDouble(valorField.getText());
                change= usd * change;
                valorField2.setText(String.valueOf(change));
                
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
        buttonsPanel.setLayout(new GridLayout(3,1,5,20));
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
       setSize(500,600);
    }

    public static void main(String[] args) {
        frames currency = new frames();
        currency.initialize();
    }

    
}
