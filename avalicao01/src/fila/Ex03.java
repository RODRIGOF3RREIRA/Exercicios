package fila;

import java.util.Scanner;

public class Ex03 {

    private static class LISTA {

        public LISTA prox;
        public LISTA ant;
        public String nome;
        public float media;

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //a lista estÃ¡ vazia,logo,
        //o objeto inicio tem o valor null
        //o objeto inicio conterÃ¡ o endereÃ§o do primeiro elemento da lista
        LISTA inicio = null;
        // o objeto fim conterÃ¡ o endereÃ§o do Ãºltimo elemento da lista
        LISTA fim = null;
        // o objeto aux Ã© um objeto auxiliar
        LISTA aux;
        // o objeto anterior Ã© um objeto auxiliar
        LISTA anterior;
        // apresentado o menu de opÃ§Ãµes
        int op, numero, achou;
        do {
            System.out.println("\nMenu de opções\n");
            System.out.println("1 - Inserir no inicio da lista");
            System.out.println("2 - Inserir no fim da lista");
            System.out.println("3 - Consultar a lista do inicio ao fim lista");
            System.out.println("4 - Consultar a lista do fim ao inicio lista");
            System.out.println("5 - Remover da lista");
            System.out.println("6 - Esvaziar a lista");
            System.out.println("7 Consultar aluno");
            System.out.println("8 - Sair");
            System.out.print("Digite sua opção:");
            op = entrada.nextInt();
            if (op < 1 || op > 8) {
                System.out.println("Opção invalida!!");
            }

            if (op == 1) {
                System.out.println("digite o número a ser inserido no inicio da lista:");
                LISTA novo = new LISTA();

                System.out.println("Digite o nome.:");
                novo.nome = entrada.next();

                System.out.println("nota.: ");
                novo.media = entrada.nextFloat();

                if (inicio == null) {
                    //a lista estava vazia e o elemento inserido serÃ¡ o primeiro e ultimo
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                    novo.ant = null;
                } else {
                    //a lista jÃ¡ contem elementos e sera inserido no inicio da lista
                    novo.prox = inicio;
                    inicio.ant = novo;
                    novo.ant = null;
                    inicio = novo;

                }
                System.out.println("numero inserido no inicio da lista");
            }
            if (op == 2) {

                LISTA novo = new LISTA();
                System.out.println("Digite a media.: ");
                novo.media = entrada.nextFloat();

                System.out.println("Digite o nome.: ");
                novo.nome = entrada.next();

                if (inicio == null) {
                    // a lista estava vazia
                    //numero inserido sera o primeiro e ultimo
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                    novo.ant = null;
                } else {
                    // a lista jÃ¡ contem elementos serÃ¡ inserido no fim da lista
                    fim.prox = novo;
                    novo.ant = fim;
                    novo.prox = null;
                    fim = novo;
                }
                System.out.println("numero inserido no fim da lista");
            }

            if (op == 3) {
                if (inicio == null) {
                    //a lista estÃ¡ vazia
                    System.out.println("Lista vazia!!");
                } else {
                    // a lista contem elementos e o elemtos sera mostrado do inicio ao fim
                    System.out.println("consultando a lista do inicio ao fim");
                    aux = inicio;

                    while (aux != null) {
                        System.out.println(aux.media + " ");
                        aux = aux.prox;
                    }
                }
            }

            if (op == 4) {
                if (inicio == null) {
                    // a lista estÃ¡ vazia
                    System.out.println("Lista vazia!!");
                } else {
                    // a lista contem elementos e estes serÃ£o mostrados do fim ao inicio
                    System.out.println("\nConsultando a lista do fim ao inicio\n");
                    aux = fim;
                    while (aux != null) {
                        System.out.print(aux.media + "  ");
                        aux = aux.ant;
                    }
                }
            }
            if (op == 5) {
                if (inicio == null) {
                    // a lista estÃ¡ vazia
                    System.out.println("Lista vazia!!");
                } else {
                    // a lista contem elementos e o elemento a ser removido deve ser digitado
                    System.out.println("\nDigite o elemento a ser removido: ");
                    numero = entrada.nextInt();
                    // todas as ocorrencias da lista iguais ao nÃºmero digitado serÃ£o removidas
                    aux = inicio;
                    achou = 0;
                    while (aux != null) {
                        if (aux.media == numero) {
                            // o numero digitado foi encontrado na lista e sera removido
                            achou = achou + 1;
                            if (aux == inicio) {
                                // o numero a ser removido Ã© o primeiro da lista
                                inicio = aux.prox;
                                if (inicio != null) {
                                    inicio.ant = null;
                                }
                                aux = inicio;
                            } else if (aux == fim) {
                                // o numero a ser removido Ã© o ultimo da lista
                                fim = fim.ant;
                                fim.prox = null;
                                aux = null;
                            } else {
                                // o numero a ser removido esta no meio da lista
                                aux.ant.prox = aux.prox;
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
                        System.out.println("Número removido " + achou + " vezes");
                    }
                }
            }
            if (op == 6) {
                if (inicio == null) {
                    // a lista estÃ¡ vazia
                    System.out.println("Lista vazia!!");
                } else {
                    // a lista serÃ¡ esvaziada
                    inicio = null;
                    System.out.println("Lista esvaziada");
                }
            }
            if (op == 7) {

                aux = inicio;

                while (aux != null) {

                    if (aux.media >= 7) {
                        System.out.println("Os alunos aprovados são.: " + aux.nome);
                    } else {
                        System.out.println("os alunos reprovados são.:" + aux.nome);

                    }
                    aux = aux.prox;
                }

            }

        } while (op != 8);
    }
}
