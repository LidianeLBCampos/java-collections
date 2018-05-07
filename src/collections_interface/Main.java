package collections_interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main {

//	static void testCol(Collection<Integer> col) {
//
//	}

	public static void main(String[] args) {
		Collection<Integer> miColleccion;

		miColleccion = new ArrayList<>();
		
		miColleccion.add(100);

//		testCol(miCollecion);
//		testCol(new ArrayList<>());
		
		miColleccion = new HashSet<>(miColleccion);
		
	}

}
