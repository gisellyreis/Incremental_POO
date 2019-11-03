public class Caixa extends Funcionario {

    public Caixa(String nome, int cpf, String bornDate, char sexo, int telefone, String[] qualidade,
            int qtdQualidades) {
        super(nome, cpf, bornDate, sexo, telefone, qualidade, qtdQualidades);
    }

    public Caixa(String nome, int cpf, String[] qualidade) {
        super(nome, cpf, qualidade);
    }
        
    @Override
    public double salario() {
        return 1000.00;
    }
}