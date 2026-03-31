/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exa;

/**
 * < > [ ]
 * @author Alex.Dev
 */
import java.util.Scanner;
import java.util.Random;
public class exa1 {
    public static void main(String[] args) {
      Scanner teclado =  new Scanner(System.in);
      Random random = new Random();
     int intento;
     int numSecreto= random.nextInt(100)+1;
      
       // System.out.println("Ingresa el numero a adivinar: ");
      do {
          System.out.println("Ingresa tu numero: ");
          intento= teclado.nextInt();
          if (intento < numSecreto) {
              System.out.println("mas Arriba");
          }else if (intento >numSecreto) {
               System.out.println("mas abajo");
          }else{
              System.out.println("adivinaste el numero!!");
          }
      }while(intento!=numSecreto);
    }
}
