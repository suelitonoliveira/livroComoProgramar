package metodos;

public class RetornandoValores {

	public static void main(String[] args) {
		
		/*
		 * 50 --- 100% x ----20% 50 * 20 = x * 100 x = (50 * 20 ) / 100
		 */
		
		Double[] premissaInicial = new Double[] {50.0, 100.0};
		Double proporcao = 20.0;
		
		Double resultadoFinal = regraDeTres(premissaInicial, proporcao);
		
		System.out.println(resultadoFinal);

	}

	static Integer numeroAleatorio() {
		return 1;
	}
	
	static Double regraDeTres(Double[] premissa, Double proporcao) {
		return (premissa[0] * proporcao) / premissa[1];
	}
}
