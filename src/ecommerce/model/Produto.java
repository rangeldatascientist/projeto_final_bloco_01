package ecommerce.model;


public abstract class Produto {
	
	private int codigo; // codigo do produto
	private String tipo; // academico, religioso
	private String titulo; // nome do livro
	private float preco; // preço que será vendido
		
	public Produto(int codigo, String titulo, float preco, String tipo) {
		this.codigo = codigo;
		this.tipo = tipo;
		this.titulo = titulo;
		this.preco = preco;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
	public void visualizar() {
			String titulo = "";
			switch (this.tipo) {
			case "1":
				tipo = "Academico";
				break;
			case "2":
				tipo = "Religioso";
				break;
			}
			
			System.out.println("Codigo do produto" + this.codigo);
			System.out.println("Categoria: "  + this.tipo);
			System.out.println("Nome do livro" + this.titulo);
			System.out.println("Valor do livro" + this.preco);
			
			
		
	}
}

