/*Crie um algoritmo que leia um vetor de 20
posições e informe:

a)Quantos números pares existem no vetor

b)Quantos números ímpares existem no vetor

c)Quantos números maiores do que 50

d)Quantos números menores do que 7*/
package modelo;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in, "ISO-8859-1");
        
        int numero[] = new int[5];
        int i, contpar = 0, contimpar = 0, contmaior = 0, contmenor = 0;

        for (i = 0; i < 5; i++) {
            System.out.println("Digite os valores do vetor 1");
            numero[i] = leitor.nextInt();
        }
        for (i = 0; i < 5; i++) {
            if ((numero[i] % 2) == 0) {
                System.out.println("Número par" + numero[i]);
                contpar++;
            } else {
                System.out.println("Número impar" + numero[i]);
                contimpar++;
            }

            if (numero[i] > 50) {
                System.out.println("Número maior" + numero[i]);
                contmaior++;
            } else if (numero[i] < 7){
                contmenor++;
            }
        }
        System.out.println("Números pares"+contpar);
        System.out.println("Números impares"+contimpar);
        System.out.println("Números maiores que 50: "+ contmaior);
        System.out.println("Números menores que 7: "+contmenor);

    }

}

