/*Crie um algoritmo que leia duas matrizes 2x5 e crie
uma terceira matriz tembém 2x5 com o valor da soma dos elementos de mesmo índice.*/
package modelo;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in, "ISO-8859-1");

        int matriz1[][] = new int[2][5];
        int matriz2[][] = new int[2][5];
        int matrizSoma[][] = new int[2][5];

        System.out.println("Digite os valores da matriz 1:");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.printf("[%d][%d]: ", i + 1, j + 1);
                matriz1[i][j] = leitor.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz 2:");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.printf("[%d][%d]: ", i + 1, j + 1);
                matriz2[i][j] = leitor.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 5; j++) {
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        System.out.println("\nA Resultado: \n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("\t %d \t", matrizSoma[i][j]);
            }
            System.out.println();
        }
    }
}
