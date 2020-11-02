package fila;

import java.util.Scanner;

public class Ex04 {

    private static class LISTA {

        public int num;
        public LISTA prox;
        public LISTA ant;
        public String nome;
        public float salario;

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
        // apresentado o menu de opÃ§Ãµes
        int op, numero, achou;
        do {
            System.out.println("\nMENU DE OPÕES\n");
            System.out.println("1 - Inserir na lista");
            System.out.println("2 - Consultar a lista do inicio ao fim lista");
            System.out.println("3 - Consultar a lista do fim ao inicio lista");
            System.out.println("4 - Remover da lista");
            System.out.println("5 - Esvaziar a lista");
            System.out.println("6 - Sair");
            System.out.print("Digite sua opção:");
            op = entrada.nextInt();
            if (op < 1 || op > 6) {
                System.out.println("Opção invalida!!");
            }

            LISTA novo = new LISTA();
            if (op == 1) {
                System.out.println("Digite o nome.:");
                novo.nome = entrada.next();

                System.out.println("salario ");
                novo.salario = entrada.nextFloat();

                if (novo.salario < 850) {

                    System.out.println("Isento");
                } else if (novo.salario >= 850 && novo.salario <= 1200) {
                    System.out.println("Dez por cento de imposto.:");
                    novo.salario = novo.salario - (novo.salario * 10 / 100);

                } else if (novo.salario > 1200) {

                    System.out.println("Vinte por cento de imposto.:");
                    novo.salario = novo.salario - (novo.salario * 20 / 100);

                }

                if (inicio == null) {
                    // a lista esta vazia e o valor inserido Ã© o primeiro e ultimo elemento da lista
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                    novo.ant = null;
                } else {
                    //a lista ja contem elemento
                    //o novo elemento sera inserido na ordem crescente
                    aux = inicio;
                    while (aux != null && novo.num > aux.num) {
                        aux = aux.prox;
                    }
                    if (aux == inicio) {
                        // o novo numero inserido e menor que todos da lista logo sera inserido no inicio
                        novo.prox = inicio;
                        novo.ant = null;
                        inicio.ant = novo;
                        inicio = novo;
                    } else if (aux == null) {
                        //novo elemento e maior que todos da lista e sera inserido no final
                        fim.prox = novo;
                        novo.ant = fim;
                        fim = novo;
                        fim.prox = null;
                    } else {
                        //o novo numero sera inserido no meio da lista entre 2 numeros ja existente
                        novo.prox = aux;
                        aux.ant.prox = novo;
                        novo.ant = aux.ant;
                        aux.ant = novo;
                    }
                }
                System.out.println("numero inserido na lista");

            }
            if (op == 2) {
                if (inicio == null) {
                    //a lista estÃ¡ vazia
                    System.out.println("Lista vazia!!");
                } else {
                    // a lista contem elementos e o elementos sera mostrado do inicio ao fim
                    System.out.println("consultando a lista do inicio ao fim");
                    aux = inicio;

                    while (aux != null) {
                        System.out.println(aux.salario + "    " + aux.nome);
                        aux = aux.prox;
                    }
                }
            }

            if (op == 3) {
                if (inicio == null) {
                    //a lista estÃ¡ vazia
                    System.out.println("Lista vazia!!");
                } else {

                    // a lista contem elementos e o elemtos sera mostrado fim ao inicio
                    System.out.println("consultando a lista do inicio ao fim");
                    aux = fim;

                    while (aux != null) {
                        System.out.println(aux.salario + "    " + aux.nome);
                        aux = aux.ant;
                    }
                }
            }

            if (op == 4) {
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
                        if (aux.num == numero) {
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
                                aux.prox.ant = aux.ant;
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
                        System.out.println("numero removido " + achou + " vezes");
                    }
                }
            }
            if (op == 5) {
                if (inicio == null) {
                    // a lista estÃ¡ vazia
                    System.out.println("Lista vazia!!");
                } else {
                    // a lista serÃ¡ esvaziada
                    inicio = null;
                    System.out.println("Lista esvaziada");
                }
            }
        } while (op != 6);
    }
}
