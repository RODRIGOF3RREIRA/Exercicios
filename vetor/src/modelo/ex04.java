/*Escreva um algoritmo que leia dois vetores de
10 posições e faça a soma dos elementos de
mesmo índice, colocando o resultado em um
terceiro vetor. Mostre o vetor resultante.*/
package modelo;

import java.util.Scanner;


public class ex04 {
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in, "ISO-8859-1");
    int numero1 [] = new int [5];
    int numero2 [] = new int [5];
    int resultado[]  = new int [5];
    int i;
    
    for (i = 0; i < 5; i++) {
        System.out.println("Digite os valores do vetor 1");
     numero1[i] = leitor.nextInt();
    }
    
    for (i = 0; i < 5; i++) {
        System.out.println("Digite os valores do vetor 2");
     numero2[i] = leitor.nextInt();
    }
    
    for (i = 0; i < 5; i++) {
        resultado [i] = numero1[i]+numero2[i];
    }
    
        System.out.println("Valores do vetor 1");
        for (i = 0; i < 5; i++) {
            System.out.println(numero1[i]);
        }
        
        System.out.println("Valores do vetor 2");
        for (i = 0; i < 5; i++) {
            System.out.println(numero2[i]);
        }
        
        System.out.println("Valores do resultado");
        for (i = 0; i < 5; i++) {
            System.out.println(resultado[i]);
        }
    
}
}