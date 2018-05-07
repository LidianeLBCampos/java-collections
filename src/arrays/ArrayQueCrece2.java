package arrays;

import java.util.Arrays;

public class ArrayQueCrece2 {

	public static void main(String[] args) {
		String[] nombres = { "Mari Pili", "Ezequiel", "Manuel", "Michael" };

		System.out.println("Antes...");
		System.out.println(Arrays.toString(nombres));

		nombres = add(nombres, "Raquel");
		System.out.println("\nDespués...");
		System.out.println(Arrays.toString(nombres));

	}

	private static String[] add(String[] nombres, String nuevoNombre) {
		String[] destino = new String[nombres.length + 1];
		System.arraycopy(nombres, 0, destino, 0, nombres.length);
		destino[nombres.length] = nuevoNombre;
		return destino;
	}

}
