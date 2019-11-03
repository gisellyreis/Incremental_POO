

class Produto {
	private String nome;
	private double preco; 
	private String codigo;

	public Produto(String nome, double preco, String codigo) {
		this.nome = nome;
		this.preco = preco;
		this.codigo = codigo;
	}

	public String getNomeProduto() {
		return nome;
	}
  public String getCodigo() {
		return this.codigo;
	}
	public double getPrecoProduto() {
		return preco;
	}
}