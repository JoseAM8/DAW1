/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edad;

import java.util.Scanner;

/**
 *
 * @author joal7509
 */
public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cuantos años tienes? ");
        edad = sc.nextInt();
        
        if(edad >= 18){
            System.out.println("Eres mayor de edad!");
        }
        else{
            System.out.println("No eres mayor de edad :( ");
        };
    }
    
}
