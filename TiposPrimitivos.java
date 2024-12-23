package Fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Tipos Primitivos - Funcionarios (como uma struct)

		// Inteiros
		byte anosDeEmpresa = 20;
		short viagensFuncionario = 523;
		int idadeDoFuncionario = 50;
		long milhasDoFuncionario = 3_254_493_314L;

		// Floats

		float salarioFuncionario = 5_400.37F;
		double vendasDoFuncionario = 11_200_343;

		// Tipo booleans

		boolean estadoFeriasFuncionario = false;

		// Tipo caractere

		char statusPontoFuncionario = 'A'; // Ativo
		// Anos do funcionario		
		System.out.println("O funcionario em dias ativos tem " + anosDeEmpresa * 365);
		// Viagens pela empresa
		System.out.println("O funcionario viajou pela empresa o total de: " + viagensFuncionario / 2);
		// Idade
		System.out.println("A idade do funcionario é: " + idadeDoFuncionario);
		// Milhas do funcionario
		System.out.println("Em milhas pela empresa o funcionario tem: " + milhasDoFuncionario);
		// Salario do funcionario
		System.out.println("O funcionario recebe: " + salarioFuncionario);
		// Vendas
		System.out.println("O total de vendas desse funcionario foi de: "+ vendasDoFuncionario);
		// Ferias
		System.out.println("Atualmente o funcionario esta de ferias? "+ estadoFeriasFuncionario);
		// Estado
		System.out.println("O funcionario esta ativo A ou desativado D: "+ statusPontoFuncionario);

	}
}
