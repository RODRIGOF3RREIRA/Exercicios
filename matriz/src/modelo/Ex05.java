/*Crie um algoritmo que leia uma matriz 3x3 e crie uma segunda matriz 
que inverta as linha e colunas da primeira matriz*/
package modelo;

import java.util.Scanner;


public class Ex05 {
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in, "ISO-8859-1");

        int matriz[][] = new int[3][3];
        int matrizInvertida [][] = new int [3][3];

        System.out.println("Digite os valores da matriz:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.printf("[%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = leitor.nextInt();
            }
        }
        
        System.out.println("\nA Matriz ficou: \n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\t %d \t", matriz[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("Matriz invertida");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                matrizInvertida[j][i] = matriz[i][j];
                System.out.printf("\t %d \t", matrizInvertida[j][i]);
            }
            System.out.println();
        }
        
    }
}
 