/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade0210;
/*
Guarde 10 números inteiros em uma matriz 5x2. Ao final, mostrar o dobro dos 
numeros armazenados.*/

import java.util.Scanner;


public class Atividade0210matrizA {

 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int numeros[][] = new int[5][2];
       
       for (int i =0; i <= 4; i++){
           for ( int j = 0; j <= 1; j++){
               System.out.println("Digite o numero");
               numeros[i][j] = sc.nextInt();
          }      
       }
       
        System.out.println("Dados armazenados na matriz: ");
       
       for (int i =0; i <= 4; i++){
           System.out.println("");
           for ( int j = 0; j <= 1; j++){
              System.out.print("Dobro de " + numeros[i][j]  + ": " +(numeros[i][j]*2)+ " ");
             
          }      
       }
   
    }
}
