/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exa;

/**
 *
 * @author Alex.Dev
 */
import java.util.Scanner;
import java.util.Random;

public class Exa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int intento;
        int numeroSecreto = random.nextInt(100)+1;
        System.out.println("Adivina el numero entre 1 Y 100");
        do {
            System.out.println("Ingresa un numero: ");
            intento = teclado.nextInt();
            if (intento < numeroSecreto) {
                System.out.println("Mas Altoo");
            }else if(intento >numeroSecreto){
                System.out.println("Mas bajo");
            }else {
                System.out.println("Adivinaste el numero:");
            }
        }while (  intento !=  numeroSecreto);
    }
}
