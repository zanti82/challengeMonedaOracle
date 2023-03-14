import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;

public class framescurrency {
    public static void main(String[] args) {
        frames2currency inicio1 = new frames2currency();
        inicio1.setVisible(true);
        inicio1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicio1.setTitle("CONVERSOR DE MONEDA");
        
       
        
    }
}

    class frames2currency extends JFrame{
       
        public frames2currency(){

            Toolkit screen1 = Toolkit.getDefaultToolkit();
            Dimension size= screen1.getScreenSize();
            int heightScreen = size.height;
            int widthScreen = size.width;
            setSize(widthScreen/3, heightScreen/3);
            setLocation(widthScreen/3, heightScreen/3);
            Image newIcon = screen1.getImage("challengeMonedaOracle/currencyChange/src/graficos/dinero.gif");
            setIconImage(newIcon);

            setLayout(new BorderLayout());

            JPanel p1 = new  JPanel();
            JPanel p2 = new  JPanel();
            JPanel p3 = new  JPanel();
           
            JComboBox currencies = new JComboBox<>();
            currencies.addItem("UDS dolar");
            currencies.addItem("EUR euro");
            currencies.addItem("YEN japon");
            currencies.addItem("POUND libra esterlina");
            currencies.addItem("WON corea");

            

            JLabel label1 = new JLabel("INGRESE EL VALOR A CAMBIAR en COP");
            JTextField field1 = new JTextField(10);
                       
            p1.add(field1);
            p1.add(label1);
            
            p2.add(currencies);
            p2.add(new JLabel("SELECCIONES LA MONEDA") );
            
            JButton change = new JButton("CONVERTIR");
            change.setBounds(100,100,100,30);
            JTextField field2 = new JTextField(10);

            p3.add(change);
            p3.add(field2);
            
            
            add(p1, BorderLayout.NORTH);
            add(p2, BorderLayout.CENTER);
            add(p3, BorderLayout.SOUTH);


        }



    }
   
   // public void actionPerformed(ActionEvent e) {
      //  if (e.getSource()==change) {
     //     String titulo=textfield1.getText();
      //    setTitle(titulo);
     //   }
     // }



