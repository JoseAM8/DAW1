/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Thezo
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el primer numero ");
        num1 = sc.nextInt();
        
        System.out.print("Introduce el segundo numero ");
        num2 = sc.nextInt();
    
        if (num1==num2) {
            System.out.println("Los numeros " + num1 + " y " + num2 + " son iguales");
        }
        else if (num1>num2) {
            System.out.println("Mostrando los numeros en orden ascendente: " + num2 + " " + num1);
        }
        else if (num1<num2) {
            System.out.println("Mostrando los numeros en orden ascendente: " + num1 + " " + num2);
        }
        else {
            System.out.println("Ha ocurrido un error");
        }
    }
    
}
