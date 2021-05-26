package metodos;

import java.util.Scanner;

public class PrimeiroMetodo {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};		
		
		System.out.println("Escolha dentre os cursos abaixo: ");
		
		iterarEExibirPosicoesVetorString(cursos);

		System.out.print("O curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		//Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		Boolean posicaoValida = validarPosicao(posicaoCursoEscolhido, cursos);
		
		if (!posicaoValida) {
			encerrarProgramaPorCausaDePosicaoInvalida();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		System.out.println("Escolha dentre as formas de pagamento abaixo: ");
		
		iterarEExibirPosicoesVetorString(formasPagamento);

		imprimir("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0 
				&& posicaoFormaPagamentoEscolhida < formasPagamento.length; 
		
		if (!posicaoValida) {
			encerrarProgramaPorCausaDePosicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
		
		scanner.close();
	}
	
	static void imprimirTraco() {
		System.out.println("------------------------------------------------");
	}
	
	static void encerrarProgramaPorCausaDePosicaoInvalida() {
		System.err.println("Posição inválida!");
		System.exit(1);
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static void  iterarEExibirPosicoesVetorString(String[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "] " + vetor[i]);
		}
	}
	 static Boolean validarPosicao(Integer posicaoCursoEscolhido, String[] vetor ) {
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < vetor.length;
		return posicaoValida; 
	}

}
