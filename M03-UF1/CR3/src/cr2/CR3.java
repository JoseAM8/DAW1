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
public class CR3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int copas;
        char ct;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cuantas copas tienes? ");
        copas = sc.nextInt();
        System.out.println("Tienes " + copas + " copas.");
        
        
        if (copas>=2000) {
            
            System.out.print("Que quieres, Caballero(c) o Bandida(b)? ");
            ct = sc.next().charAt(0);

            if (ct=='c') {
                System.out.println("Has escogido el Caballero!");
            }
            else if (ct=='b') {
                System.out.println("Has escogido la Bandida!");
            }
            else{
                System.out.println("Has introducido un valor incorrecto.");
            }

        }
        
        else if (copas<2000) {
            
            System.out.print("Que quieres, Mago Electrico(m) o Mega Esbirro(e)? ");
            ct = sc.next().charAt(0);
        
            if (ct=='m') {
            System.out.println("Has escogido el Mago Electrico!");
            }
            else if (ct=='e') {
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
