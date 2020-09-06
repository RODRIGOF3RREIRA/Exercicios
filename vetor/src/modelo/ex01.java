/*Crie um algoritmo que leia um vetor de 10
números inteiros. Em seguida, calcule e escreva
o somatório dos valores deste vetor.*/
package modelo;

import java.util.Scanner;

public class ex01 {
     public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in, "ISO-8859-1");
        
    int i;
    int soma = 0;
    int numero[] = new int [10];
    
    System.out.println("Digite 10 valores do vetor");
    for(i = 0; i < 10; i++){
        numero[i] = leitor.nextInt();
    }
    
    for (i = 0; i < 10; i++){
        soma = soma + numero[i];
    }
    
    
    System.out.println("A soma dos valores é: "+soma);
    
  }
}
