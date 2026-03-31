/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaat4;

/**
 *
 * @author User
 */
public class Aulaat4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int cont2 = 0;
        int cont3 = 0;
        int cont5 = 0;

        int i = 1;

        do {

            if (i % 2 == 0) {
                cont2++;
            }

            if (i % 3 == 0) {
                cont3++;
            }

            if (i % 5 == 0) {
                cont5++;
            }

            i++;

        } while (i <= 1000);

        System.out.println("Múltiplos de 2: " + cont2);
        System.out.println("Múltiplos de 3: " + cont3);
        System.out.println("Múltiplos de 5: " + cont5);
    }
    
}
