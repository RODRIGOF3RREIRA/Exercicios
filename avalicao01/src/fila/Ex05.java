package fila;

import java.util.Scanner;

public class Ex05 {

    private static class LISTA {

        float num;
        public LISTA proxi;

        int impar, numero, par;
    }

    public static void main(String[] args) {
        int op, numeros, achou;

        Scanner entrada = new Scanner(System.in);

        //a lista esta vazia,logo,
        //o objeto inicio tem o valor null
        //o objeto inicio conterá o endereco
        //do primeiro elemento da lista
        LISTA inicio = null;

        // o objeto fim contera o endereco
        //do último elemento da lista
        LISTA fim = null;

        //o abjeto aux é um objeto auxiliar
        LISTA auxi;

        // o abjeto aneterior é um objeto auxiiliar
        LISTA anterior;
        // apresentando o menu de opções
        LISTA Par;
        LISTA Impar;
        do {
            System.out.println("\nMENU DE OPÇÕES\n");
            System.out.println("1 - inserir no inicio da lista");
            System.out.println("2 - Consultar toda a lista");
            System.out.println("3 - Remove da lista");
            System.out.println("4 - Esvaziar a lista");
            System.out.println("5 - Sair");

            System.out.println("Digite sua opção: ");
            op = entrada.nextInt();

            if (op < 1 || op > 6) {
                System.out.println("Opcao invalida!!");
            }

            if (op == 1) {

                System.out.println("Digite o numero a ser inserido no inicio da lista:");

                LISTA novo = new LISTA();

                System.out.println("Dijite um número ");
                novo.numero = entrada.nextInt();

                if (inicio == null) {
                    // a lista estava vazia
                    // e o elemento inserido será
                    // o primeiro e o último 
                    inicio = novo;
                    fim = novo;
                    novo.proxi = null;
                } else {

                    // a lista ja contém elementos 
                    // e o novo elemento sera inserido no inicio da lista!!
                    novo.proxi = inicio;
                    inicio = novo;
                }
                System.out.println("Numero inserido no inicio da lista!!");
            }

            if (op == 2) {
                if (inicio == null) {
                    // a lista esta vazia
                    System.out.println("A lista eta vazia");
                } else {
                    // a lista contém elementos e estes serao mostrados do inicio ao fim
                    System.out.println("\n Consultando toda a lista\n");
                    
                    auxi = inicio;
                    Par = inicio;
                    Impar = inicio;
                    
                    while (auxi != null) {

                        if (auxi.numero % 2 == 0) {
                            Par.par = auxi.numero;
                            
                        } else {                   
                            Impar.impar = auxi.numero;
                        }
                       
                        if(Par.par == 0){
                        
                        }else{
                        System.out.println("par: " + Par.par + "   " + "Impar: " + Impar.impar + "");
                    }
                        auxi = auxi.proxi;
                    }
                    

                    
                   

                }

            }

            if (op == 3) {
                if (inicio == null) {

                    // a lista esta  vazia
                    System.out.println("Lista vazia!!");
                } else {
                    // a lsita contem elementos e o elemento a ser removido deve ser digitado
                    System.out.println("\nDigite o elemtno a ser removido: ");
                    numeros = entrada.nextInt();
                    //toda as ocorrencias da lista, iguais ao numero digitado serao removidos

                    auxi = inicio;
                    anterior = null;
                    achou = 0;
                    while (auxi != null) {
                        if (auxi.num == numeros) {

                            achou = achou + 1;
                            // o numero digitado foi econtrado na lista e sera removido

                            if (auxi == inicio) {

                                // o numero a ser removido é o primeiro da lista 
                                inicio = auxi.proxi;
                                auxi = inicio;

                            } else if (auxi == fim) {
                                // o numero a ser removido é o ultimo da lista
                                anterior.proxi = null;
                                fim = anterior;
                                auxi = null;

                            } else {	// o numero a ser removido esta no meio da lista
                                anterior.proxi = auxi.proxi;
                                auxi = auxi.proxi;
                            }

                        } else {
                            anterior = auxi;
                            auxi = auxi.proxi;

                        }

                    }

                    if (achou == 0) {
                        System.out.println("Numero não encontrado");
                    } else if (achou == 1) {
                        System.out.println("Numero removido 1 vez");
                    } else {
                        System.out.println("Numero removido" + achou + "vezes");
                    }

                }

            }

            if (op == 4) {
                if (inicio == null) {
                    // a lista esta vazia
                    System.out.println("Lista vazia!!");
                } else {
                    // A lista sera esvaziada
                    inicio = null;
                    System.out.println("Lista esvaziada");

                }

            }

        } while (op != 5);
    }

}
