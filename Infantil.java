/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaescolar;

import java.util.Scanner;


public class Infantil {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
       
        String nome;
        int idade;
        
        
        System.out.println("Digite o nome da crianca");
        nome = sc.next();
        
        System.out.println("Digite a idade da crianca");
        idade = sc.nextInt();
        
        if(idade<=2){
            System.out.println("Encaminhar " + nome+ " ao bercario");
        } else if(idade<=4){
            System.out.println("Encaminhar " + nome+ " ao Infantil A.");
        } else if(idade<=5){
            System.out.println("Encaminhar " + nome+ " ao Infantil B.");
        } else if(idade<=6){
          System.out.println("Encaminhar " + nome+ " ao Infantil C.");
        } else{
            System.out.println( nome + " esta fora da tabela.");
        }
    }   
}
