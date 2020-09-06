/*Escreva um algoritmo que leia um vetor com
15 posições de números inteiros. Em seguida,
escreva somente os números positivos que se
encontram no vetor.*/
package modelo;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in, "ISO-8859-1");

        int i;
        int vetor[] = new int[15];
        int positivo[] = new int[15];

        System.out.println("Digite 15 valores do vetor");
        for (i = 0; i < 15; i++) {
            vetor[i] = leitor.nextInt();
        }

        for (i = 0; i < 15; i++) {
            if (vetor[i] >= 1) {
                positivo[i] = vetor[i];
            }else;
        }
        for (i = 0; i < 15; i++) {
            System.out.println("Positivos: "+positivo[i]);
        }
        

        }

    }

