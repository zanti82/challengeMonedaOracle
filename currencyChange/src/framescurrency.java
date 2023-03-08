import javax.swing.JFrame;
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



        }



    }



