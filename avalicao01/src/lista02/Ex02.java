package lista02;


import java.util.Scanner;


public class Ex02 {
	
	
	private static class PILHA
	{
		public int num;
		public PILHA proxPilha;
	}
	
	
	
	public static void main(String[] args) {
    
		
	Scanner entrada = new Scanner(System.in);
	
	PILHA topo = null;
	PILHA auxPilha;
	int op;
	
	do
	{
		System.out.println("\nMENU DE OPÇÕES\n");
		System.out.println("1 - inserir na pilha");
		System.out.println("2 - Consultar Pares");	
		System.out.println("3- sair");
		System.out.println("digite sua opção");
		op = entrada.nextInt();
		if (op <1 || op > 6)
		System.out.println("Opção inválida");
		
                if (op < 1 || op > 3) {
                System.out.println("Opção invalida!!");
            }
                if (op == 1)
		{
			System.out.println("digite o numero a ser inserido na pilha:");
			PILHA novo = new PILHA();
			novo.num = entrada.nextInt();
			novo.proxPilha = topo;
			topo = novo;
			System.out.println("numero inserido na pilha");
			
		}else if (op == 2)
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
                                    
                                    if (auxPilha.num % 2 == 0){
                                    
					System.out.println(auxPilha.num+" ");    
					
                                    }
                                    auxPilha = auxPilha.proxPilha;
				}
			}
		}
		

		
	
	}while (op != 3);
		
		
		
	}

   }
