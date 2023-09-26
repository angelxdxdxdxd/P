
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author labcca
 */
public class Switch {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int expresion = 2;
        
        switch (expresion) {
            case 1:
                System.out.println("Introduce dos numeros");
                int s1 = lectura.nextInt();
                int s2 = lectura.nextInt();
                
                int suma = s1 + s2;
                System.out.println("La suma es " + suma);
                break;
            case 2:
                System.out.println("Introduce dos numeros");
                int num1 = lectura.nextInt();
                int num2 = lectura.nextInt();
                
                int mult = num1 - num2;
                System.out.println("La resta es " + mult);
                break;
            
            default:
                System.out.println("Introduce dos numeros");
                int d1 = lectura.nextInt();
                int d2 = lectura.nextInt();
                
                int div = d1*d2;
                System.out.println("La multiplicacion es " + div);
                break;
        }
        
    }
}
