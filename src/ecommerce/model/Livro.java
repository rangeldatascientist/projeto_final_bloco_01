package ecommerce.model;

public class Livro extends Produto{
	private String editora;
	

	public Livro(int codigo, String titulo, float preco, String tipo, String editora) {
		super(codigo, titulo, preco, tipo);
		this.editora = editora;
	
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
	
}
