package lambda;

import java.util.function.Consumer;

public class Mostrador implements Consumer<Usuario>{

	@Override
	public void accept(Usuario t) {
		System.out.println(t.getNome());
		
	}

}
