/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exa;

/**
 * < > [ ]
 * @author Alex.Dev
 */
import javax.swing.JOptionPane;
public class exa5 {
    public static void main(String[] args) {

        int [] numeros = new int[5];
        
        for (int i = 0; i < 5; i++) {
        String input= JOptionPane.showInputDialog("Ingrea el numero: "+(i+1));
        numeros[i]= Integer.parseInt(input);
        }
        
        int mayor=numeros[0];
        int menor=numeros[0];
        
            for (int j = 0; j < numeros.length; j++) {
                
                if (numeros[j]>mayor) {
                    mayor  = numeros[j];
                }
                if(numeros[j]<menor){
                 menor = numeros[j];
                }
            }
        
        JOptionPane.showMessageDialog(null, "el numero mayor es "+mayor+"\nEl numero menor es: "+menor);
        
    }
    
}
