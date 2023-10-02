/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author joal7509
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char mes;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una de estas letras: E, F, M o A: ");
        mes = sc.next().charAt(0);
        
        switch (mes) {
            case 'E':
            case 'e':
                System.out.println("Enero");
                break;
            case 'F':
            case 'f':
                System.out.println("Febrero");
                break;
            case 'M':
            case 'm':
                System.out.println("Marzo");
                break;  
            case 'A':
            case 'a':
                System.out.println("Abril");
                break;  
            default:
                System.out.println("Valor no valido.");
                break;
        }
    }
    
}
