/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author joal7509
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce tu calificacion numerica: ");
        nota = sc.nextDouble();
        
        if (nota>=0&&nota<3) {
            System.out.println("Tu nota es Muy Deficiente("+ nota + ")");
        }
        else if (nota>=3&&nota<5) {
            System.out.println("Tu nota es Insuficiente("+ nota + ")");
        }
        else if (nota>=5&&nota<6) {
            System.out.println("Tu nota es un Bien("+ nota + ")");
        }
        else if (nota>=6&&nota<9) {
            System.out.println("Tu nota es un Notable("+ nota + ")");
        }
        else if (nota>=9&&nota<10) {
            System.out.println("Tu nota es Insuficiente("+ nota + ")");
        }
        else {
            System.out.println("Ha ocurrido un error.");
        }
    };
    
}
