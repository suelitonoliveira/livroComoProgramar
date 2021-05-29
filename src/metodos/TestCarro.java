package metodos;

public class TestCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.20;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
		double total = van.obterAutonomia();
		
		System.out.println("A autonomia do carro com parametros é: " + total + " KM");
		
		double calc = van.calcularCombustivel(10.0);
		
		System.out.println(" Quantidade de combustivel: "+calc);
	}

}
