/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerc11;

import java.util.Scanner;

/**
 *
 * @author joal7509
 */
public class Ejerc11 {

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
        
        if(num1 == num2){
            System.out.println("Los numeros " + num1 + " y "+ num2 + " son iguales.");
        }
        else if(num1 > num2){
            System.out.println(num1 + " es mayor que " + num2);
        }
        else{
            System.out.println(num2 + " es mayor que " + num1);
        }
    }
    
}
