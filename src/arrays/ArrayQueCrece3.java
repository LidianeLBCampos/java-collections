package arrays;

import java.util.Arrays;

public class ArrayQueCrece3 {

	public static void main(String[] args) {
		String[] nombres = { "Mari Pili", "Ezequiel", "Manuel", "Michael" };

		System.out.println("Antes...");
		System.out.println(Arrays.toString(nombres));

		nombres = add(nombres, "Raquel");
		System.out.println("\nDespués...");
		System.out.println(Arrays.toString(nombres));

	}

	private static String[] add(String[] nombres, String nuevoNombre) {
		int i = nombres.length;

		String[] destino;
		destino = Arrays.copyOf(nombres, i + 1);
		destino[i] = nuevoNombre;
		return destino;
	}

}
