package chap10;

import java.io.Serializable;

public class CorpData {
	
	class Employee implements Serializable{
		String name;
		int age;
	
	}
	
	class Department implements Serializable{
		String name;
		Employee leader;
		public Department(String name, Employee leader) {
			super();
			this.name = name;
			this.leader = leader;
		}
		
	}
}
