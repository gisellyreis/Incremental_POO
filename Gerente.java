public class Gerente extends Funcionario {

    public Gerente(String nome, int cpf, String bornDate, char sexo, int telefone, String[] qualidade,
            int qtdQualidades) {
        super(nome, cpf, bornDate, sexo, telefone, qualidade, qtdQualidades);
    }

    public Gerente(String nome, int cpf, String[] qualidade) {
        super(nome, cpf, qualidade);
    }
    
    @Override
    public double salario() {
        double salario = 2000.00;
        System.out.println("Salario: R$"+salario);
        return salario;
    }
}