public class Student{
	String name;
	int number;
	double gpa;
	
	public Student(String name, int number, double gpa){
		this.name = name;
		this.number = number;
		this.gpa = gpa;
	}
	
	String getName(){
		return name;
	}
	int getNumber(){
		return number;
	}
	double getGPA(){
		return gpa;
	}

	public String toString(){
		return "Name: "+this.name+", Number: "+this.number+", GPA: "+this.gpa;
	}
}