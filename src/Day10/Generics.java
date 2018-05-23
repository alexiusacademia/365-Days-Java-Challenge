package Day10;public class Generics<T> {
	private T t;

	public Generics(T t) {
		this.t = t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}
}