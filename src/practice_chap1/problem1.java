package practice_chap1;

public class problem1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<101;i++ ){
			sb.append(i+",");
		}
		String s = sb.toString();
		System.out.println(s);
		String[] sArray = s.split(",");
		for(String w : sArray){
			System.out.println(w);
		}
	}

}
