/*Crie um algoritmo que calcule a média dos elementos de uma matriz 5x2*/

package modelo;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in, "ISO-8859-1");

        int matriz[][] = new int[5][2];
        int soma;
        int media = 0;

        System.out.println("Digite os valores da matriz:");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 2; j++) {
                System.out.printf("[%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = leitor.nextInt();
            }
        }
         System.out.println("\nA Matriz ficou: \n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("\t %d \t", matriz[i][j]);
            }
            System.out.println();
        }
        
        for (int i = 0; i < 5; i++) {
            soma = 0;
            
            for (int j = 0; j < 2; j++) {
                soma = soma + matriz[i][j];
            }
                media = soma / 10;
    }
        System.out.printf("A média dos valores da matriz é:%d\n",media);
   }
}
 