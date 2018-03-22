package chap10;

import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Hero hero1 = new Hero("shupo",77,77);
		FileOutputStream fos = new FileOutputStream("rpgsave.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(hero1);
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream("rpgsave.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Hero hero2 = (Hero) ois.readObject();
		ois.close();
		System.out.println(hero2.getName());
	}

}
