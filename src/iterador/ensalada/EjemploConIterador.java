package iterador.ensalada;

import java.util.ArrayList;
import java.util.Arrays;

public class EjemploConIterador {

	public static void main(String[] args) {
		ArrayList<String> ensalada = new ArrayList<String>(Arrays.asList("tomate", "tomate", "olivas", "atún", "tomate",
				"lechuga", "zanahoria", "tomate", "tomate"));
		
		for (int i = 0; i < ensalada.size(); i++) {
			
			String ingrediente = (String) ensalada.get(i);
			
			if (ingrediente.equals("tomate")) {
				ensalada.remove(i);
				System.out.println("tomate quitado en la posicion: " + i);
			}
		}
		System.out.println(ensalada);

	}

}
