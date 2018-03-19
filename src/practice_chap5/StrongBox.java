package practice_chap5;

public class StrongBox<E> {
	private E Data;
	private KeyType keyType;
	private int trialNum;
	public void put(E d) {
		this.Data = d;
	}
	public E get() {
		this.trialNum +=1;
		return this.Data;
	}
}
