/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaescolar;

import java.util.Scanner;


public class Mediaescolar {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Double n1, n2, n3, n4, media;
        
        System.out.println("Informe a primeira nota:");
        n1 = sc.nextDouble();
        
        System.out.println("Informe a segunda nota:");
        n2 = sc.nextDouble();
        
        System.out.println("Informe a terceira nota:");
        n3 = sc.nextDouble();
        
        System.out.println("Informe a quarta nota:");
        n4 = sc.nextDouble();
        
        media = (n1 + n2 + n3 + n4)/4;
        
        /*
        if(media >= 6){
            System.out.println("Aluno aprovado!\n Valor da media: " + media);
        } else if(media >= 3){
            System.out.println("Aluno em recuperacao!\n Valor da media: " + media);
        } else{
             System.out.println("Aluno reprovado!\n Valor da media: " + media);
        } */   
        
        
        if(media <3){
            System.out.println("Aluno reprovado!\n Valor da media: " + media);
        } else if(media <= 5.9){
            System.out.println("Aluno em recuperacao!\n Valor da media: " + media);
        } else{
             System.out.println("Aluno aprovado !\n Valor da media: " + media);
        }  
    }
    
}
