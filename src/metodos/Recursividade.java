package metodos;

public class Recursividade {

	public static void main(String[] args) {
		// método chamando o próprio método
		//imprimirNumero(0);
		
		String[] alunos = new String[] {"Sueliton","João","Maria"};
		
		iterarNomes(alunos);
	}
	static void imprimirNumero(Integer numero) {
		System.out.println("Número: " + numero);
		
		if (numero < 10) {
			imprimirNumero(++numero);
		}
		
	}

	static void iterarNomes(String[] alunos) {
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Aluno: " + alunos[i]);
		}
	}
}
