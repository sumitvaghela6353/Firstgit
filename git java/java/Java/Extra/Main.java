class Main {
	public static void main(String args[]){
		//Student s1 = new Student();
		Student s2 = new Student(10);
		Student s3 = new Student(100, "Abhi");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}

class Student{
	private int id;
	private String name;
	
	//public Student(){
		
//	}
	
	public Student(int id){
		this.id = id;
		this.name = "Default";
	}
	
	public Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer(name);
		name = sb.reverse().toString();
		return "Student [id: "+id+"  name: "+name+" ]";
	}
}