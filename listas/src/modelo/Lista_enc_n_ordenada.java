package modelo;

import java.util.Scanner;

public class Lista_enc_n_ordenada {

    private static class LISTA {

        public int num;
        public LISTA prox;
        private Object ant;
    }
        //definindo a classe que representará
        //cada elemento da lista
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //a lista está vazia,logo,
        //o objeto inicio tem o valor null
        //o objeto inicio conterá o endereço do primeiro elemento da lista
        LISTA inicio = null;
        // o objeto fim conterá o endereço do último elemento da lista
        LISTA fim = null;
        // o objeto aux é um objeto auxiliar
        LISTA aux;
        // o objeto anterior é um objeto auxiliar
        LISTA anterior;
        // apresentado o menu de opções
        int op, numero, achou;
        do {
            System.out.println("\nMENU DE OPÇÕES\n");
            System.out.println("1 - Inserir no início da lista");
            System.out.println("2 - Inserir no fim da lista");
            System.out.println("3 - Consultar a lista do inicio ao fim lista");
            System.out.println("4 - Consultar a lista do fim ao inicio lista");
            System.out.println("5 - Remover da lista");
            System.out.println("6 - Esvaziar a lista");
            System.out.println("7 - Sair");
            System.out.print("Digite sua opção:");
            op = entrada.nextInt();
            if (op < 1 || op > 7) {
                System.out.println("Opção inválida!!");
            }

            if (op == 1) {
                System.out.println("digite o número a ser inserido no início da lista:");
				LISTA novo = new LISTA();
                novo.num = entrada.nextInt();
                if (inicio == null) {
                    //a lista estava vazia e o elemento inserido será o primeiro e ultimo
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                    novo.ant = null;
                } else {
                    //a lista já contem elementos e sera inserido no inicio da lista
                    novo.prox = inicio;
                    inicio.ant = inicio;
                    novo.ant = null;
                    inicio = novo;
                }
                System.out.println("numero inserido no inicio da lista");
            }
            if (op == 2) {
                System.out.println("digite numero a ser inserido no fim da lista");
                LISTA novo = new LISTA();
                novo.num = entrada.nextInt();
                if (inicio == null) {
                    // a lista estava vazia
                    //numero inserido sera o primeiro e ultimo
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                    novo.ant = null;

                } else {
                    // a lista já contem elementos será inserido no fim da lista
                    fim.prox = novo;
                    novo.ant = fim;
                    novo.prox = null;
                    fim = novo;
                }
                System.out.println("numero inserido no fim da lista");
            }

            if (op == 3) {
                if (inicio == null) {
                    //a lista está vazia
                    System.out.println("Lista vazia!!");
                } else {
                    // a lista contem elementos e o elemtos sera mostrado do inicio ao fim
                    System.out.println("consultando a lista do inicio ao fim");
                    aux = inicio;

                    while (aux != null) {
                        System.out.println(aux.num + " ");
                        aux = aux.prox;
                    }
                }
            }

            if (op == 4) {
                if (inicio == null) {
                    // a lista está vazia
                    System.out.println("Lista vazia!!");
                } else {
                    // a lista contem elementos e estes serão mostrados do fim ao inicio
                    System.out.println("\nConsultando a lista do fim ao inicio\n");
                    aux = fim;
                    while (aux != null) {
                        System.out.print(aux.num + "  ");
                        aux = aux.ant;
                    }
                }
            }
            if (op == 5) {
                if (inicio == null) {
                    // a lista está vazia
                    System.out.println("Lista vazia!!");
                } else {
                    // a lista contem elementos e o elemento a ser removido deve ser digitado
                    System.out.println("\nDigite o elemento a ser removido: ");
                    numero = entrada.nextInt();
                    // todas as ocorrencias da lista iguais ao número digitado serão removidas
                    aux = inicio;
                    achou = 0;
                    while (aux != null) {
                        if (aux.num == numero) {
                            // o numero digitado foi encontrado na lista e sera removido
                            achou = achou + 1;
                            if (aux == inicio) {
                                // o numero a ser removido é o primeiro da lista
                                inicio = aux.prox;
                                if (inicio != null) {
                                    inicio.ant = null;
                                }
                                aux = inicio;
                            } else if (aux == fim) {
                                // o numero a ser removido é o ultimo da lista
                                fim = (LISTA) fim.ant;
                                fim.prox = null;
                                aux = null;
                            } else {
                                // o numero a ser removido esta no meio da lista
                                aux.ant = aux.prox;
                                aux = aux.prox;
                            }
                        } else {

                            aux = aux.prox;
                        }
                    }
                    if (achou == 0) {
                        System.out.println("Número nao encontrado");
                    } else if (achou == 1) {
                        System.out.println("numero removido 1 vez");
                    } else {
                        System.out.println("número removido " + achou + " vezes");
                    }
                }
            }
            if (op == 6) {
                if (inicio == null) {
                    // a lista está vazia
                    System.out.println("Lista vazia!!");
                } else {
                    // a lista será esvaziada
                    inicio = null;
                    System.out.println("Lista esvaziada");
                }
            }
        } while (op != 7);
    }
}
