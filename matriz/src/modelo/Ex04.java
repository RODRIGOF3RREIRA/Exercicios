/*informe qual o maior e qual o menor elemento existente em uma matriz 6x3*/
package modelo;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in, "ISO-8859-1");

        int matriz[][] = new int[6][3];

        System.out.println("Digite os valores da matriz:");

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.printf("[%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = leitor.nextInt();
            }
        }

        System.out.println("\nA Matriz ficou: \n");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\t %d \t", matriz[i][j]);
            }
            System.out.println();
        }
        int max = matriz[0][0];
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 3; j++) {

                if (matriz[i][j] > max) {
                        max  = matriz[i][j];
                }
            }
        }
        System.out.println("O maior é "+matriz);

    }
}
