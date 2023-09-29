/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author joal7509
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el primero numero: ");
        num1 = sc.nextInt();
        
        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();
        
        System.out.print("Introduce el tercer numero: ");
        num3 = sc.nextInt();
        
        if (num1>num2&&num1>num3) {
            System.out.println("El numero " + num1 + " es el mayor");
        }
        else if (num2>num1&&num2>num3) {
            System.out.println("El numero " + num2 + " es el mayor");
        }
        else if (num3>num1&&num3>num2) {
            System.out.println("El numero " + num3 + " es el mayor");
        }
        else {
            System.out.println("Ha ocurrido un error.");
        };
        
    }
    
}
