package metodos;

public class Recursividade {

	public static void main(String[] args) {
		// m�todo chamando o pr�prio m�todo
		//imprimirNumero(0);
		
		String[] alunos = new String[] {"Sueliton","Jo�o","Maria"};
		
		iterarNomes(alunos);
	}
	static void imprimirNumero(Integer numero) {
		System.out.println("N�mero: " + numero);
		
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
