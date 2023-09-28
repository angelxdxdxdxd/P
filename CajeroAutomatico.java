
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author labcca
 */
public class CajeroAutomatico {
    public static void main(String[] args) {
        double saldo = 5000.0; 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Cajero Automatico");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Depositar Dinero");
        System.out.println("3. Retirar Dinero");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Su saldo actual es: $" + saldo);
                break;
            case 2:
                System.out.println("Ingrese la cantidad a depositar:");
                double deposito = scanner.nextDouble();
                saldo += deposito;
                System.out.println("Nuevo saldo: $" + saldo);
                break;
            case 3:
                System.out.println("Ingrese la cantidad a retirar:");
                double retiro = scanner.nextDouble();
                if (retiro <= saldo) {
                    saldo -= retiro;
                    System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                } else {
                    System.out.println("Fondos insuficientes.");
                }
                break;
            default:
                System.out.println("Opcion no valida. Por favor, seleccione una opcion valida.");
                
            /*
             *Ángel Manuel colín Rodríguez
             *Karla Guadalupe Palma Jimenez
            */
            
        }
    }
}
    

