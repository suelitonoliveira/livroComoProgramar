package algworksworksfor;

public class IteracaoFor {

	public static void main(String[] args) {
		
		/*
		 * for (int i = 0; i < 5; i++) { System.out.println("Uma frase qualquer."); }
		 * 
		 */

		/*
		 * Double[] carrinhoDeCompras = new Double[] {50.0, 50.0, 50.0}; Double total =
		 * 0.0; for (int i = 0; i < carrinhoDeCompras.length; i++) {
		 * System.out.println("Itera��o " + i + ", Total: " + total); total +=
		 * carrinhoDeCompras[i];
		 * 
		 * }
		 * 
		 * System.out.println("Total: " + total)
		 */;
		 
		/*
		 * for (int i = 0; i < 10; i++) { if (i == 5) {
		 * System.out.println("Vai parar!"); break; }
		 * 
		 * System.out.println("Itera��o: " + i); }
		 */
		 
		 Integer[] produtos = new Integer[] {100, 225, 300};
		 for (int i = 0; i < produtos.length; i++) {
			 Integer produto = produtos[i];
			 System.out.println("Produto de c�digo: " + produto);
			if (produto.equals(225)) {
				System.out.println("Produto encontrado!");
				break;
			}
	
		}
	}

}
