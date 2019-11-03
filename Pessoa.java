
public class Pessoa {
	private String nome;
	private int cpf;
	private String bornDate;
	private char sexo;
	private int telefone;
	private static int id =0; 
	
	public Pessoa(String nome, int cpf, String bornDate, char sexo, int telefone){
		this.nome = nome;
		this.cpf = cpf;
		this.bornDate = bornDate;
		this.sexo = sexo;
		this.telefone = telefone;
		id +=1;
	}

  public Pessoa(String nome, int cpf){
	    this.nome = nome;
		this.cpf = cpf;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Pessoa.id = id;
	}
	
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getBornDate() {
		return bornDate;
	}
	public void setBornDate(String bornDate) {
		this.bornDate = bornDate;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	

}