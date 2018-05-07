package list_interface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		List<String> miLista = new ArrayList<>();
		miLista.add(0, "Paco");
		miLista.add(1, "Javier");
		miLista.add(0, "Paco");
		
		Set<String> miConjunto;
		
		//miConjunto =(Set<String>) miLista;
		
		miConjunto = new HashSet<>(miLista);
		
		miConjunto.forEach(System.out::println);
		
		miConjunto.add("Manuel");
		System.out.println("Contiene a Javier? " + miConjunto.contains("Javier"));
		

			
	}

}
