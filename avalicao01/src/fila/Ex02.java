package fila;

import java.util.Scanner;


public class Ex02

{
	//definindo a classe que representa cada elemento da lista
	static float maior;
	private static class LISTA
	{
		public int num;
		public LISTA prox;
		public String nome;
		public float salario;
		public LISTA valor;
		
		
	}
	
	public static void main(String args[])
	{
		Scanner entrada = new Scanner (System.in);
		//lista esta vazia logo inicio tem valor nulo
		//objeto inicio primeiro elemento da lista
		LISTA inicio = null;
		//objeto fim é final da lista
		LISTA fim = null;
		//objeto aux é objeto auxiliar
		LISTA aux;
		//objeto anterior é objeto auxiliar
		LISTA anterior;
		// apresentar menu de opções
		int op, numero, achou,cont,cont2;
		float media,soma,valor;	
		String nomes;
		nomes = null;
		
		System.out.println("Digite o salario para consultar.:");
		valor = entrada.nextFloat();
		
		do
	
		{   
			System.out.println("\n MENU DE OPÇÕES\n");
			System.out.println(" 1 - inserir no inicio da lista");
			System.out.println(" 2 - consultar toda a lista");
			System.out.println(" 3 - remover da lista");
			System.out.println(" 4 - esvaziar a lista");
			System.out.println(" 5 - sair");
			System.out.println(" digite sua opção");
			op = entrada.nextInt();
			
			
				
			
			if (op<1 || op > 5)
			System.out.println("opção invalida");
			
			
			if (op == 1)
			{
				
				
				LISTA novo = new LISTA();

				
				System.out.println("Digite o nome.:");
				novo.nome = entrada.next();
				
				System.out.println("salario ");
				novo.salario = entrada.nextFloat();				
				
				if(inicio == null)
				{
					// a lista esta vazia e o valor inserido é o primeiro e ultimo elemento da lista
					inicio = novo;
					fim = novo;
					novo.prox = null;				
					
				}
				else
					
				{
					//a lista ja contem elemento
					//o novo elemento sera inserido na ordem crescente
					anterior = null;
					aux = inicio;
					while (aux != null && novo.num > aux.num)
					{
						anterior = aux;
						aux = aux.prox;
					}
					if (anterior == null)
					{
						// o novo numero inserido e menor que todos da lista logo sera inserido no inicio
						novo.prox = inicio;
						inicio = novo;
					}
					else if (aux == null)
					{
						//novo lemento e maior que todos da lista e sera inserido no final
						fim.prox = novo;
						fim = novo;
						fim.prox = null;
					}
					else
					{
					//o novo numero sera inserido no meio da lista entre 2 numeros ja existente
					anterior.prox = novo;
					novo.prox = aux;
				}
			}
			System.out.println("numero inserido na lista");

		}

		if (op == 2) {		
			
		if ( inicio == null)
		{
			//lista esta vazia
			System.out.println("A lista esta vazia");
		}
		else 
		{// a lista sera mostrada do inicio ao fim
			soma = 0;
			System.out.println("consultando a lista");
			aux = inicio;
			maior = aux.salario;
			cont = 0;
			cont2 = 0;
			
			while (aux != null)
				
			{
				soma = soma + aux.salario;
				cont = cont +1;
			
				
			if(aux.salario >= maior){
				maior =  aux.salario;
				nomes = aux.nome;							
						
			}if(aux.salario >= valor) {
				cont2= cont2 + 1;
				
			}
					
			
			aux = aux.prox;
			
			}
			aux = inicio;
			
			while (aux != null) {
				
				if(maior==aux.salario) {
					nomes=aux.nome;
					System.out.println("o maior salario igual é do "+ nomes);
				
				}
				aux = aux.prox;
		}	
			
			System.out.println("a media do salario é.:" + ((soma / cont)));
			System.out.println("o nome do funcionario.: " + nomes);
			System.out.println("O maior salario é.:" + maior);
			System.out.println("Existem " + cont2 + "salario maior que.: " + valor);
		}
		
		
	}
		
	if (op == 3)
	{
		if ( inicio == null)
		{
			//a lista esta vazia
			System.out.println("A lista esta vazia");
		}
		else
		{
			// a lista contem elementos e o elemento digitado sera removido
			System.out.println("digite o elemento para remover");
			numero = entrada.nextInt();
			//remover todos elementos iguais
			aux = inicio;
			anterior = null;
			achou = 0;
			while (aux != null)
			{
				if (aux.num == numero) {
										
				// o numero digitado foi encontrado e sera removido
				achou = achou + 1;
				if ( aux == inicio)
				{
					// o numero a ser removido e o primeiro da lista
					inicio = aux.prox;
					aux = inicio;
				}
				else if (aux == fim)
				{
					// o elemento a ser removido é ultimo da lista
					anterior.prox = null;
					fim = anterior;
					aux = null;
				}
				else {
					// o elemento a ser removido esta no meio da lista
					anterior.prox = aux.prox;
					aux = aux.prox;
				}
			}
			else
			{
				anterior = aux;
				aux = aux.prox;
			}
		}
		if (achou == 0)
		System.out.println("numero nao encontrado");
		else if (achou == 1)
		System.out.println("numero removido 1 vez");
		else
		System.out.println("numero removido" +achou+"vezes");
	}
}
if (op == 4)
{
	if (inicio == null)
	{
		//lista esta vazia
		System.out.println("A lista esta vazia");
	}
	else
	{
		//a lsita sera aesvaziada
		inicio = null;
		System.out.println("A lista esvaziada");
	}
}
}
while(op != 5);
}
}
