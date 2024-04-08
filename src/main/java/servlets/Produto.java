package servlets;

public class Produto {
	private String descricao, categoria;
	private Double preco;

	public Produto(String descricao, String categoria, Double preco) {
		this.descricao = descricao;
		this.categoria = categoria;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
}