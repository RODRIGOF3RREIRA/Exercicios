package pilha;


import java.util.Scanner;


public class Ex01 {
	
	
	private static class PILHA
	{
		public int num;
		public PILHA proxPilha;
	}
	
	private static class FILA
	{
		public int num;
		public FILA proxFila;
	}
	
	public static void main(String[] args) {
    
		
	Scanner entrada = new Scanner(System.in);
	
	PILHA topo = null;
	PILHA auxPilha;
	int op;
	

	FILA inicio = null;
	FILA fim = null;
	FILA auxFila;
	
	
	do
	{
		System.out.println("\nMENU DE OPÇÕES\n");
		System.out.println("1 - inserir na fila");
		System.out.println(" 2 - Consultar toda a fila");
		System.out.println("3 - Inserir na Pilha");
		System.out.println("4 - Consultar Pilha");
		System.out.println("5 - Consultar pilha e fila");
		System.out.println("6- sair");
		System.out.println("digite sua opção");
		op = entrada.nextInt();
		if (op <1 || op > 6)
		System.out.println("Opção inválida");
		
		
		if (op == 1)
		{
			System.out.println("digite o numero a ser inserido na fila:");
			FILA novo = new FILA();
			novo.num = entrada.nextInt();
			novo.proxFila = null;
			if(inicio == null)
			{
				// a fila esta vazia
				// o numero inserido sera o primeiro e ultimo
				inicio = novo;
				fim = novo;
			}
			else
			{
				fim.proxFila = novo;
				fim = novo;
			}
			System.out.println("numero inserido na fila");
		} 
		
		else if (op == 2)
		
		{
			if (inicio == null)
			{
				// a fila esta vazia
				System.out.println("fila vazia");
			}
			else
			{
				// a fila contem elementos e este serao mostrados do primeiro inserido ao ultimo
				System.out.println("\nConsultando a fila\n");
				auxFila = inicio;
				while ( auxFila != null)
				{
					System.out.println(auxFila.num+" ");
					auxFila = auxFila.proxFila;
				}
			}
		}
		
		else if (op ==3)
		{
			System.out.println("digite o numero a ser inserido na pilha:");
			PILHA novo = new PILHA();
			novo.num = entrada.nextInt();
			novo.proxPilha = topo;
			topo = novo;
			System.out.println("numero inserido na pilha");
			
		}else if (op == 4)
		{
			if (topo == null)
			{
				// a pilha esta vazia
				System.out.println("pilha vazia");
			}
			else
			{
				// a pilha contem elementos e este serao mostrados do ultimo inserido ao primeiro
				System.out.println("\nConsultando a pilha\n");
				auxPilha = topo;
				while ( auxPilha != null)
				{
					System.out.println(auxPilha.num+" ");
					auxPilha = auxPilha.proxPilha;
				}
			}
		}
		
		
		if (op == 5)
		{
			if (inicio == null)
			{
				// a fila esta vazia
				System.out.println("fila vazia");
			}
			else
				System.out.println("Fila");
			{
				auxFila = inicio;
						
				while ( auxFila != null)
				{
					System.out.println(auxFila.num+" ");
					auxFila = auxFila.proxFila;
				}
				auxPilha = topo;
				
				if (topo == null)
				{
					// a pilha esta vazia
					System.out.println("pilha vazia");
				}else
			  {
					System.out.println("pilha");	
				auxPilha = topo;
						
				while ( auxPilha != null)
					
				{
					System.out.println(auxPilha.num+" ");
					auxPilha = auxPilha.proxPilha;
				}
				
			}	
				
			
			}
		}
	}while (op != 6);
		
		
		
	}

   }
