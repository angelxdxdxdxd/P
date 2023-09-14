/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg4;
import java.util.Scanner;

/**
 *
 * @author labcca
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Cantiad en pesos");
        double peso = lectura.nextDouble();
        
        double dolar = peso/17.13;
        
        double euro = peso/18.29;
        
        System.out.println("$" + peso + " pesos en dolares es : $" + dolar);
        System.out.println("$" + peso + " pesos en euros es : " + euro);
                
    }
    
}
