/*Escreva um algoritmo que leia um vetor com
8 posições de números inteiros. Em seguida, leia
um novo valor do usuário e verifique se valor se
encontra no vetor. Se estiver, informe a posição
desse elemento no vetor. Caso o elemento não
esteja no vetor, apresente uma mensagem
informando “O número não se encontra no
vetor”.*/
package modelo;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in, "ISO-8859-1");

        int usuario;
        int vetor[] = new int[8];
        int i;

        System.out.println("Digite os valores do vetor:");
        for (i = 0; i < 8; i++) {
            vetor[i] = leitor.nextInt();
        }

        System.out.println("Busque um valor no vetor");
        usuario = leitor.nextInt();

        for (i = 0; i < 8; i++) {
            if (usuario == vetor[i]) {
                System.out.println("O vetor possui este valor");
            }else {
                System.out.println("O vetor não possui este valor");
            }
            break;

        }

    }
}
