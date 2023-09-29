/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase;

import java.util.Scanner;

/**
 *
 * @author joal7509
 */
public class Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        char clase;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("A que calse vas? (A, B o C) ");
        clase = sc.next().charAt(0);
        System.out.println("Vas a la clase " + clase);
        
        System.out.print("Que edad tienes? ");
        edad = sc.nextInt();
        System.out.println("Tienes " + edad + " años");
        
        if (edad >= 18 && clase == 'A') {
            System.out.println("Correcto, eres mayor de edad asi que vas a la clase " + clase);
        }
        else if (edad < 18 && clase == 'C' || clase =='B') {
            System.out.println("Correcto, eres menor de edad asi que vas a la clase " + clase);
        }
        else{
            System.out.println("No eres de la clase que has seleccionado o no tienes la edad especificada.");
        }
        
    }
    
}
