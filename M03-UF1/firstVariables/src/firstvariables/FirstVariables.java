/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstvariables;

import java.util.Scanner;

/**
 *
 * @author joal7509
 */
public class FirstVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int m01n, m02n, m03n;
   
        Readable source;
        Scanner pantalla = new Scanner(System.in);
       
        /*
        Preguntar al usuario
        */
        
        System.out.println("Que nota crees que tendras en m03?");
        
        m03n = pantalla.nextInt();
       
        System.out.println("Tu nota de M03 sera " + m03n);
        
  
        
        System.out.println("Y en m02?");
        
        m02n = pantalla.nextInt();
        
        System.out.println("Tu nota de M02 sera " + m02n);
          
        
        
        System.out.println("Y en m01?");
        
        m01n = pantalla.nextInt();
        
        System.out.println("Tu nota de M01 sera " + m01n);
    }
    
}
