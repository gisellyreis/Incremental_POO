import java.util.*;

class Venda {
	private String data;
	private Pessoa funcionario;
	private Pessoa cliente;
	private ArrayList<ItemVenda> itensVenda;
	private int qtdVenda;

	public Venda(String data, Pessoa funcionario, Pessoa cliente, int qtdVenda){
		this.data = data;
		this.funcionario = funcionario;
		this.cliente = cliente;
		this.itensVenda = new ArrayList<ItemVenda>();
		this.qtdVenda = qtdVenda;
	}
	public Venda(String data, Pessoa funcionario, String nome, int cpf, int qtdVenda){
	    this.data = data;
	    this.funcionario = funcionario;
	    this.cliente = new Pessoa(nome,cpf);
	    this.itensVenda = new ArrayList<ItemVenda>();
	    this.qtdVenda = qtdVenda;
	}
	public Venda(String data, Pessoa funcionario, Pessoa cliente){
		this(data, funcionario, cliente, 1);
	}
	public void setFuncionario(Pessoa funcionario){
		this.funcionario = funcionario;
	}
	public void setCliente(Pessoa cliente){
		this.cliente = cliente;
	}

  public void addItem(Produto produto, int qtd){
    ItemVenda item = new ItemVenda(produto,qtd);
    this.itensVenda.add(item);
  }

  public void addItem(Produto produto){
    ItemVenda item = new ItemVenda(produto, 1);
    this.itensVenda.add(item);
  }

  public void removeItem(String codigo){
    for( ItemVenda item : itensVenda) {
      if (item.getProdutoCodigo() == codigo) {
        itensVenda.remove(item);
        break;
      }
    }
  }

	public Pessoa getFuncionario() {
		return funcionario;
	}

	public ArrayList<ItemVenda> getItensVenda() {
		return itensVenda;
	}

	public void setItensVenda(ArrayList<ItemVenda> itensVenda) {
		this.itensVenda = itensVenda;
	}

	public int getQtdVenda() {
		return qtdVenda;
	}

	public void setQtdVenda(int qtdVenda) {
		this.qtdVenda = qtdVenda;
	}

  

}