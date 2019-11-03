import java.util.*;

public class Loja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] qualidade = {"calmo", "rapido","calmo", "rapido","inteligente"};
		Funcionario pedro = new Funcionario("Pedro", 3467, qualidade);
		pedro.salario();
		
		Vendedor novo = (Vendedor)pedro;

		if(novo instanceof Funcionario)
			System.out.println("Funcionario");
		if(novo instanceof Vendedor)
			System.out.println("Vendedor");
		if(novo instanceof Gerente)
			System.out.println("Gerente");
		

		sc.close();
	}

}
