package modelo;

import java.util.Scanner;

public class Lista_enc_n_ordenada {

    private static class LISTA {

        public int num;
        public LISTA prox;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in, "ISO-8859-1");
        //a lista esta vazia, logo o objeto inicio tem o valor null.
        //objeto contem endereço do primeiro elemento da LISTA.
        LISTA inicio = null;
        //objeto fim conterá endereço do ultimo elemento da lista.
        LISTA fim = null;
        //objeto anterior é objeto auxiliar 
        LISTA anterior;

        int op, numero, achou;

        do {
            System.out.println("Menu de opções");
            System.out.println("1 - Inserir no inicio da lista");
            System.out.println("2 - Inserir no fim da lista");
            System.out.println("3 - consultar toda a lista");
            System.out.println("4 - Remover a lista");
            System.out.println("5 - Esvaziar a lista");
            System.out.println("6 -Sair");
            System.out.println("Digite sua opção");
            op = leitor.nextInt();
            if (op < 1 || op > 6) {
                System.out.println("Opção Invalida");

                if (op == 1) {
                    System.out.println("Digite o numero a ser inserido no inicio da lista");
                    LISTA novo = new LISTA();
                    novo.num = leitor.nextInt();
                    if (inicio == null) {
                        //a lista estava vazia e o elemento inserido será primeiro e ultimo
                        inicio = novo;
                        fim = novo;
                        novo.prox = null;
                    } else;
                    //lista contem elementos
                    //novo elemento será inserido no inicio da lista
                    novo.prox = inicio;
                    inicio = novo;
                }
                System.out.println("Número inserido no inicio da lista");
            }
            if (op == 2){
                System.out.println("Digite o número a ser inserido no fim da lista");
                LISTA novo = new LISTA();
                novo.num = leitor.nextInt();
                if(inicio == null){
                    //lista vazia
                    //O elemento inserido é o inicio e o fim da lista
                    inicio = novo;
                    novo.prox = null;
                }else{
                    //lista ja contem algum elemento
                    //o novo elemento sera inserido no fim da lista.
                    fim.prox = novo;
                    fim = novo;
                    fim.prox = null;
                }
                System.out.println("Numero inserido no fim da lista");
            }
            if(op == 3){
                System.out.println("Lista vazia");
            }else{
                System.out.println("\n Consultando a lista");
                LISTA aux = inicio;
                while (aux != null) {
                    System.out.println(aux.num+ " ");
                    aux = aux.prox; 
                    
                }
            }
            
            if (op == 4){
                if(inicio == null){
                    System.out.println("Lista vazia");
                }else{
                    System.out.println("\n digite o elemento a ser removido");
                    numero = leitor.nextInt();
                    LISTA aux = inicio;
                    anterior = null;
                    achou = 0;
                    while(aux != null){
                        if(aux.num == numero){
                            achou = + 1;
                            if(aux == inicio){
                                //o numero a ser removido é o primeiro da lista
                                inicio = aux.prox;
                                aux = inicio;
                            }else if (aux == fim){
                                anterior.prox = null;
                                fim = anterior;
                                aux = null;
                            }
                        }
                    }
                    
                }
            }
            
        }while(op != 5);
    }
}

