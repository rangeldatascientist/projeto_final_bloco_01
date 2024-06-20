package ecommerce.model;

public class Ebook extends Produto{
	private String formato;

	public Ebook(int codigo, String titulo, float preco, String tipo, String formato) {
		super(codigo, titulo, preco, tipo);
		this.formato = formato;
		
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

}
