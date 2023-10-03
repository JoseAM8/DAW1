/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horastrabajadas;

import java.util.Scanner;

/**
 *
 * @author joal7509
 */
public class HorasTrabajadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas, tarnorm=20, tarextr=30;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cuantas horas has laburado? ");
        horas = sc.nextInt();
        
        int horasextr=horas-35, calc=horasextr*tarextr, suma=calc+700;
        
        if (horas<=35) {
            System.out.println("Cobraras " + horas*tarnorm + " Euros");
        }
        
        else if (horas>35) {
            System.out.println("Cobraras " + suma + " Euros");
        }
        
        else {
            System.out.println("Ha ocrrido un error");
        }
    }
    
}
