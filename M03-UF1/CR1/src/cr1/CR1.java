/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cr1;

import java.util.Scanner;

/**
 *
 * @author joal7509
 */
public class CR1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ct;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Que quieres, Mago Electrico(0) o Mega Esbirro(1)? ");
        ct = sc.nextInt();
        
        if (ct==0) {
            System.out.println("Has escogido el Mago Electrico!");
        }
        else if (ct==1) {
            System.out.println("Has escogido el Mega Esbirro!");
        }
        else{
            System.out.println("Has introducido un valor incorrecto.");
        }
    }
    
}
