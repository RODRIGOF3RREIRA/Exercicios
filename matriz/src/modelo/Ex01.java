/*Crie um algoritimmo que leia uma matriz 5x5.
Emseguida, conte quantos números pares existem na matriz*/
package modelo;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in, "ISO-8859-1");

        int matriz[][] = new int[5][5];

        System.out.println("Digite os valores da matriz:");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.printf("[%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = leitor.nextInt();
            }
        }
        
        System.out.println("\nA Matriz ficou: \n");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.printf("\t %d \t",matriz[i][j]); 
            }
            System.out.println();
        }

    }

}
