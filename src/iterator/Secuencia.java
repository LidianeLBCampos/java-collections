package iterator;

public class Secuencia {

	private Object[] items;
	private int next = 0;

	public Secuencia(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length)
			items[next++] = x;
	}

	public Iterador iterador() {
		return new MiIterador();
	}

	private class MiIterador implements Iterador {
		private int i;

		@Override
		public boolean fin() {
			return i == items.length;
		}

		@Override
		public Object actual() {
			return items[i];
		}

		@Override
		public void siguiente() {
			if (i < items.length)
				i++;
			else
				throw new RuntimeException("Se ha alcanzado el inicio de la secuencia");

		}

	}

	private class IteradorInverso implements Iterador {

		private int i = items.length - 1;

		@Override
		public boolean fin() {
			return i < 0;
		}

		@Override
		public Object actual() {
			return items[i];
		}

		@Override
		public void siguiente() {
			if (i > 0)
				i--;
			else
				throw new RuntimeException("Se ha alcanzado el inicio de la secuencia");
		}

	}

}
