/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade2509;

import java.util.Scanner;


public class PesquisaProduto {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        String nome, sexo, resp, inicio;
        int idade, contador, qtdF, qtdM;
        contador = 0;
        qtdF = 0;
        qtdM = 0;
         
        System.out.println("Deseja participar da pesquisa? Digite 'S' para sim ");
        inicio = sc.next();
        
        while(inicio.equals("S")| inicio.equals("s")){
         
            System.out.println("Informe seu nome: ");
            nome = sc.next();

            System.out.println("Informe sua idade: ");
            idade = sc.nextInt(); 

            System.out.println("Sexo: \n Digite 'F' para feminino ou 'M' para maculino: ");
            sexo = sc.next();
            
            if(sexo.equals("F")| sexo.equals("f")){
                qtdF++;
            }
            
            if(sexo.equals("M")| sexo.equals("m")){
                qtdM++;
            }

            System.out.println("Gotou do produto? Digite 'S' para sim e 'N' para nao: ");
            resp = sc.next();
        
            contador++;
            
            System.out.println("Deseja realizar a  pesquisa novamente? Digite 'S' para sim: ");
            inicio = sc.next();
        }
          
        System.out.println("Quantidade de pessoas que responderam a pesquisa: " + contador);
        
        System.out.println("Quantidade de HOMENS que responderam a pesquisa:" + qtdM);
          
        System.out.println("Quantidade de MULHERES que responderam a pesquisa:" + qtdF);   
    }
}
