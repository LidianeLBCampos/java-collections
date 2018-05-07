package comparadores;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Persona[] personas = new Persona[4];
		
		personas[0] = new Persona("Manuel", "Torres Jimenez", 56);
		personas[1] = new Persona("Roberto", "Calvo Sanchez", 6);
		personas[2] = new Persona("Maria Luisa", "Fernandez Guitierrez", 16);
		personas[3] = new Persona("Raquel", "Martinez Lopes", 16);
		
		System.out.println("Antes");
		System.out.println(Arrays.toString(personas));
		
		Arrays.sort(personas);
		
		System.out.println("Despues");
		System.out.println(Arrays.toString(personas));
	}

}
