package metodos;

public class Lampada {
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajur;

	boolean ligada;

	void ligar() {
		ligada = true;
	}

	void desligar() {
		ligada = false;
	}

	void mostrarEstado() {
		System.out.println("Lampada está " + ligada);
	}
	void mudarEstado() {
		if (ligada) {
			desligar();
		}else {
			ligar();
		}
	}
}
