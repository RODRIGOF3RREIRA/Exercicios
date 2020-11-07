package lista02;

import java.util.Scanner;

public class Ex04 {

    private static class PILHA {

        public int num, Impar, Par;
        public PILHA proxPilha;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        PILHA topo = null;
        PILHA auxPilha;
        PILHA par;
        PILHA impar;
        int op;

        do {
            System.out.println("\nMENU DE OPÇÕES\n");
            System.out.println("1 - Inserir na Pilha");
            System.out.println("2 - Consultar Pilha");
            System.out.println("3 - Consultar pares e impares");
            System.out.println("0- sair");
            System.out.println("digite sua opção");
            op = entrada.nextInt();
            if (op < 1 || op > 3) {
                System.out.println("Opção inválida");
            }

            if (op == 1) {
                System.out.println("digite o numero a ser inserido na pilha:");
                PILHA novo = new PILHA();
                novo.num = entrada.nextInt();
                novo.proxPilha = topo;
                topo = novo;
                System.out.println("numero inserido na pilha");

            } else if (op == 2) {
                if (topo == null) {
                    // a pilha esta vazia
                    System.out.println("pilha vazia");
                } else {
                    // a pilha contem elementos e este serao mostrados do ultimo inserido ao primeiro
                    System.out.println("\nConsultando a pilha\n");
                    auxPilha = topo;
                    par = topo;
                    impar = topo;
                    while (auxPilha != null) {

                        if (auxPilha.num % 2 == 0) {
                            par.Par = auxPilha.num;
                            
                        } else {
                            impar.Impar = auxPilha.num;
                            
                        }

                        System.out.println("PIHLA");
                        System.out.println(auxPilha.num + " ");
                        auxPilha = auxPilha.proxPilha;
                    }
                }
            } else if (op == 3) {
                if (topo == null) {
                    // a pilha esta vazia
                    System.out.println("Pares e impares");
                } else {
                    auxPilha = topo;
                    par = topo;

                    while (par != null) {

                        System.out.println("Par");
                        System.out.println(par.Par + " ");
                        par = par.proxPilha;
                    }

                }
                auxPilha = topo;
                impar = topo;
                while (impar != null) {

                    System.out.println("impar");
                    System.out.println(impar.Impar + " ");
                    impar = impar.proxPilha;
                }
            }

        } while (op != 0);

    }

}
