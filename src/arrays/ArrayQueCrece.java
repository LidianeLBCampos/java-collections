package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayQueCrece {

	public static void main(String[] args) {
		String[] nombres = { "Mari Pili", "Ezequiel", "Manuel", "Michael" };

		System.out.println("Antes...");
		System.out.println(Arrays.toString(nombres));

		nombres = add(nombres, "Raquel");
		System.out.println("\nDespués...");
		System.out.println(Arrays.toString(nombres));

	}

	private static String[] add(String[] nombres, String nuevoNombre) {
		List<String> lista;
		
		lista = new ArrayList<>(Arrays.asList(nombres));
		lista.add(nuevoNombre);
		
		return lista.toArray(new String[] {});
	}

}
