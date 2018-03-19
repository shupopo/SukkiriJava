package practice_chap5;

public class StrongBox<E> {
	private E Data;
	public void put(E d) {
		this.Data = d;
	}
	public E get() {
		return this.Data;
	}
}
