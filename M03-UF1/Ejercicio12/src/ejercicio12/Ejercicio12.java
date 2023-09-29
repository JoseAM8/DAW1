/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Thezo
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero ");
        num = sc.nextInt();
        
        if (num >= 0) {
            System.out.println("El numero " + num + " es positivo");
        }
        else{
            System.out.println("El numero " + num + " es negativo");
        }
    }
    
}
