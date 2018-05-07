package iterador.ensalada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Ejemplo {

	public static void main(String[] args) {
		ArrayList<String> ensalada = new ArrayList<String>(Arrays.asList("tomate", "tomate", "olivas", "atún", "tomate",
				"lechuga", "zanahoria", "tomate", "tomate"));
		Iterator<String> it = ensalada.iterator();
		
		for (; it.hasNext();) {
			
			String ingrediente = (String) it.next();
			
			if (ingrediente.equals("tomate")) {
				it.remove();
			}
		}
		System.out.println(ensalada);

	}

}
