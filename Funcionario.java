import java.util.*;

public class Funcionario extends Pessoa {
	private String status;
	private String[] qualidade = new String[5];
	private int qtdQualidades=0;
		
	
	public Funcionario(String nome, int cpf, String bornDate, char sexo, int telefone,	String[] qualidade, int qtdQualidades) {
		super(nome, cpf, bornDate, sexo, telefone);
		this.status = "ativo";
		this.qualidade = qualidade;
		this.qtdQualidades = qtdQualidades;
	}
	
	public Funcionario(String nome, int cpf, String[] qualidade) {
		super(nome, cpf);
		this.status = "ativo";
		this.qualidade = qualidade;
		this.qtdQualidades = 1;
	}
	
	public void setMudaStatus(){
		this.status = "inativo";
	}

	public void setQualidade(String qualidade, int posicao){
	    if(posicao >= 0 && posicao < 5) {
	      this.qualidade[posicao] = qualidade;
	    }
	  }

	public void setQualidade(String qualidade){
	    if(this.qtdQualidades < 5){
	     this.qualidade[qtdQualidades] = qualidade;
	     this.qtdQualidades++;
	    }
	    else {
	      this.qualidade[qtdQualidades-1] = qualidade;
	    }
	}

  
	public void exibeQualidade(){
	    for(int i =0; i< this.qtdQualidades; i++){
	      System.out.println(qualidade[i]);
	    }
	}

	public void ordenaQualidade(){
	    Arrays.sort(qualidade, 0, qtdQualidades);
	    exibeQualidade();
	}

	public void limpaQualidades(){
	    for(int i =0; i< this.qtdQualidades; i++){
	      this.qualidade[i] = "";
	    } 
	}

	//------ Increneltal 6 ------//
	public double salario() {
		return 0.0;
	}


}
