/*Crie um algoritimmo que leia uma matriz 5x5.
Emseguida, conte quantos números pares existem na matriz*/
package modelo;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in, "ISO-8859-1");
        
        int matriz[] [] = new int[5][5];
        int i;
        
        System.out.println("Digite os valores da matriz:");
        for (i = 0; i < 25; i++) {
            matriz[i] [i] = leitor.nextInt();
        }
        
        for(i = 0; i < 25 ;i++){
            System.out.println(matriz[i] [i]);
        }
        
    }
    
}
