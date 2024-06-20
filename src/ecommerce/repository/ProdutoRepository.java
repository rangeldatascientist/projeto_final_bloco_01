package ecommerce.repository;

import ecommerce.model.Produto;

public interface ProdutoRepository {

	 //CRUD da Livraria
	public void procurarPorCodigo (int codigo);
	public void listarTodos ();
	public void cadastrar (Produto titulo);
	public void atualizar (Produto titulo);
	public void excluir (int codigo);
	
	
	// Métodos Livraria
	public void codigo (int codigo);
	public void titulo (int preco);
	
	
	
	
}
