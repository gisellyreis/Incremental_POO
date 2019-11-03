public class Vendedor extends Funcionario {

    public Vendedor(String nome, int cpf, String bornDate, char sexo, int telefone, String[] qualidade,
            int qtdQualidades) {
        super(nome, cpf, bornDate, sexo, telefone, qualidade, qtdQualidades);
    }

    public Vendedor(String nome, int cpf, String[] qualidade) {
        super(nome, cpf, qualidade);
    }
    
    @Override
    public double salario() {
        double salario = 850.00;
        System.out.println("Salario: R$"+salario);
        return salario;
    }
    
}