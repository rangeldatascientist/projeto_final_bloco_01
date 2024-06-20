package ecommerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        int opcao = 0;
        
        while (true) {
        		System.out.println("**********************************");
        		System.out.println("                                  ");
        		System.out.println("         Rangel Livraria          ");
        		System.out.println("                                  ");
        		System.out.println("**********************************");
        		System.out.println("       1. Cadastrar livro         ");
        		System.out.println("       2. Listar livros           ");
        		System.out.println("       3. Atualizar livro         ");
        		System.out.println("       4. Excluir livro           ");
        		System.out.println("       5. Sair                    ");
        		System.out.println("       6. Escolha uma opção:       ");
        		opcao = leia.nextInt();   // senão fechar da loop infinito        
            
            if (opcao == 5) {
				System.out.println("\nRangel Livraria - Desperte seus conhecimentos, leia um livro!");
				leia.close();
				System.exit(0);
			}
            switch (opcao) {
			case 1:
				System.out.println("\nCadastrar um livro\n");

				break;
			case 2:
				System.out.println("\nListar todos os livros\n\n");

				break;
			case 3:
				System.out.println("\nAtualizar informações do livro\n\n");

				break;
			case 4:
				System.out.println("\nExcluir um livro\n\n");

				break;
			case 5:
				System.out.println("\nOpção inválida\n\n");

				break;
			
				
			
            }
      }  
      
        
	}
	
}
        

	
	
            
            
            
        
	


