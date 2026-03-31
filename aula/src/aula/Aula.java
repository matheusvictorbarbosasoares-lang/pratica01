/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Aula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
    
        int x,y=1;
        System.out.println("Escolha um número:\n");
        x = sc.nextInt();
        do{
            y*=x;
            x--;
      }while(x>0);
        System.out.println("Valor: " + y);
      
            
        }
    
}
