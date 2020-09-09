/*Crie um algoritmo que leia uma matriz 3x3 e calcule a soma dos valores das colunas da matriz.*/
package modelo;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in, "ISO-8859-1");

        int matriz[][] = new int[3][3];
        int soma;

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

        for (int j = 0; j < 3; j++) {
            soma = 0;
            
            for (int i = 0; i < 3; i++) {
                soma = soma + matriz[i][j];
            }
            
            System.out.printf("Soma da coluna %d: %d\n", j, soma);
        }

    }
}
