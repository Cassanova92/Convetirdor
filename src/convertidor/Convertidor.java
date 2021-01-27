package convertidor;

import java.util.Scanner;

public class Convertidor {

    public static void main(String[] args) {
    Scanner scn=new Scanner (System.in);
    System.out.println("Ingresar Grados en Farenheit");
    double farenheit=scn.nextDouble();
    double centrigrados=(farenheit-32)/1.8;
    System.out.println("Grados Centigrados"+centrigrados);
    
    }
    
}
