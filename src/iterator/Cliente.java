package iterator;

public class Cliente {

	public static void main(String[] args) {
		Secuencia secuencia = new Secuencia(10);

		secuencia.add("Paco");
		secuencia.add(55);
		secuencia.add(true);
		secuencia.add(new java.util.Date());
		secuencia.add('a');

		Iterador it = secuencia.iterador();
		while (it.fin()) {
			System.out.println(it.actual());
			it.siguiente();
		}
	}

}
