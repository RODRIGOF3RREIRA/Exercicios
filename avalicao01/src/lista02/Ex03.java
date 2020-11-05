package lista02;

import java.util.Scanner;


public class Ex03 {
    
    private static class PILHA
	{
		public int num;
		public PILHA proxPilha;
                public String nome;
                int nota;
                
	}
    
    public static void main(String[] args) {
    
		
	Scanner entrada = new Scanner(System.in);
	
	PILHA topo = null;
	PILHA auxPilha;
	int op;
	
	do
	{
		System.out.println("\nMENU DE OPÇÕES\n");
		System.out.println("1 - Cadastrar aluno");
		System.out.println("2 - ");	
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
			System.out.println("Cadastrar aluno:");
			PILHA novo = new PILHA();
			novo.nome = entrada.next();
			novo.proxPilha = topo;
			topo = novo;
			System.out.println("Aluno cadastrado");
			
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
    

