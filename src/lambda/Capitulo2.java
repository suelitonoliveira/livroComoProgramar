package lambda;

import java.util.Arrays;
import java.util.List;



public class Capitulo2 {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Sueliton de oliveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme silveira", 190);
		
		List<Usuario> usuarios = Arrays.asList(user1,user2,user3);
		
		for (Usuario u : usuarios) {
			System.out.println(u.getNome());
		}
		
		System.out.println("--------------------instanciando um mostrador-------------");
		
		Mostrador mostrador = new Mostrador();
		usuarios.forEach(mostrador);
	
	}
	
}
