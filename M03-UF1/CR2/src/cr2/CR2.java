/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cr2;

import java.util.Scanner;

/**
 *
 * @author joal7509
 */
public class CR2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int copas, ct;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cuantas copas tienes? ");
        copas = sc.nextInt();
        System.out.println("Tienes " + copas + " copas.");
        
        
        if (copas>=2000) {
            
            System.out.print("Que quieres, Caballero(0) o Bandida(1)? ");
            ct = sc.nextInt();

            if (ct==0) {
                System.out.println("Has escogido el Caballero!");
            }
            else if (ct==1) {
                System.out.println("Has escogido la Bandida!");
            }
            else{
                System.out.println("Has introducido un valor incorrecto.");
            }

        }
        
        else if (copas<2000) {
            
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
        
        else {
            System.out.println("Ha  ocurrido un error.");
        }
    }
    
}
