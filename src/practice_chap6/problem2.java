package practice_chap6;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Func1 f1 = x -> x % 2 ==1;
		Func2 f2 = (male, name) ->{
			if(male == true){
				return "Mr."+name;
			}else{
				return "Ms."+name;
			}
		
		};

}
