import java.util.Scanner;

import javax.swing.JFrame;

public class currencyChange {
    public static void main(String[] args) {

        frames2currency inicio1 = new frames2currency();
        inicio1.setVisible(true);
        inicio1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicio1.setTitle("CONVERSOR DE MONEDA");
        

        
       
        
        double cop, usd, eur, yen, pound, won;

        System.out.println("CONVERTIR PESOS A DOLARES");
        System.out.println("Ingrese por favor el valor en pesos: ");
        Scanner scn = new Scanner(System.in);
        cop = scn.nextDouble();
        usd = cop * 0.00021;
        System.out.println( "" + cop + " pesos son "+ usd + " dolares");

        System.out.println("CONVERTIR PESOS A EUROS");
        System.out.println("Ingrese por favor el valor en pesos: ");
        Scanner scn1 = new Scanner(System.in);
        cop = scn1.nextDouble();
        eur = cop*0.00019;
        System.out.println( "" + cop + " pesos son "+ eur + " euros");

        System.out.println("CONVERTIR PESOS A YENES");
        System.out.println("Ingrese por favor el valor en pesos: ");
        Scanner scn2 = new Scanner(System.in);
        cop = scn2.nextDouble();
        yen = cop*0.028;
        System.out.println( "" + cop + " pesos son "+ yen + " yenes");

        System.out.println("CONVERTIR PESOS A LIBRAS");
        System.out.println("Ingrese por favor el valor en pesos: ");
        Scanner scn3 = new Scanner(System.in);
        cop = scn3.nextDouble();
        pound = cop*0.00017;
        System.out.println( "" + cop + " pesos son "+ pound + " libras");  

        System.out.println("CONVERTIR PESOS A WON SURCOREANO");
        System.out.println("Ingrese por favor el valor en pesos: ");
        Scanner scn4 = new Scanner(System.in);
        cop = scn4.nextDouble();
        won = cop*0.27;
        System.out.println( "" + cop + " pesos son "+ won + " wons");  


    }
}
