/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade0210;
/*Guardar 5 números inteiros em vetor e ao final mostrar o dobro dos números
  armazenados.*/

import java.util.Scanner;


public class Atividade0210vetorA {

 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int numero[] = new int[5];
       
       for(int i=0; i <=4; i++){
           System.out.println("Digite o numero: ");
           numero[i] = sc.nextInt();
       }
       
       for(int i=0; i <=4; i++){
          System.out.println("Dobro de " + numero[i]  + ": " + (numero[i] * 2));
       }  
    }
}
