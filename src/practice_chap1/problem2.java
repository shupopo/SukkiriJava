package practice_chap1;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String folder = "c/aaa";
		String file = "readme.txt";
		String fileName;
		if(folder.endsWith("¥")){
			fileName = folder + file;
		}else{
			fileName = folder + "¥"+ file;
		}
		System.out.println(fileName);
	}

}
