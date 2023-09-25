/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade2509;

import java.util.Scanner;


public class Atividade2509 {

    public static void main(String[] args) {
      String nome;
      int idade;
      Double peso;
      Double altura;
      Double IMC;
      
      Scanner sc = new Scanner(System.in);
      
      for(int i =1; i <=3;i++){

        System.out.println("Digite seu nome:");
        nome = sc.next();

        System.out.println("Informe sua idade");
        idade = sc.nextInt();

        System.out.println("Informe seu peso");
        peso = sc.nextDouble();

        System.out.println("Informe sua altura");
        altura = sc.nextDouble();

       IMC = peso/(altura*altura);

       System.out.println("Nome: " + nome+ "| Idade: " + idade);

       System.out.println("Peso: " + peso + "| Altura: " + altura);

       System.out.println("Seu IMC e: " + IMC);


       if(IMC<18.5){
          System.out.println("Sua classificacao foi: Abaixo do peso normal.");
       } else if(IMC <= 24.9){
           System.out.println("Sua classificacao foi: Peso normal.");
       }  else if(IMC <= 29.9){
           System.out.println("Sua classificacao foi: Excesso de peso.");
       }  else if(IMC <= 34.9){
           System.out.println("Sua classificacao foi: Obesidade classe |");
       }  else if(IMC <= 39.9){
           System.out.println("Sua classificacao foi: Obesidade classe ||");
       }  else if(IMC >=40){
           System.out.println("Sua classificacao foi: Obesidade classe |||");
       }
      } 
     
     
     
     
    }
    
}
