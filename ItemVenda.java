public class ItemVenda{
  private Produto produto;
  private int qtd;

  public ItemVenda(Produto produto, int qtd){
    this.produto = produto;
    if(qtd > 0){
      this.qtd = qtd;
    }
  }

  public ItemVenda(Produto produto) { 
    this.produto = produto;
    this.qtd = 1;
  }

  public double valorVenda () {
    return this.produto.getPrecoProduto() * (double)qtd;
  }

  public String getProdutoCodigo () {
    return produto.getCodigo();
  }
}