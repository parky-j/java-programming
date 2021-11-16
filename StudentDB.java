public class StudentDB{
	enum FindGPAParam { LOWER_THAN, HIGHER_THAN } ;
	Student[] stuArr;
	int idx = 0;

	FindGPAParam findGPA;	

	public StudentDB(){
		stuArr = new Student[3];
	}
	
	void add(Student stu){
		stuArr[idx] = stu;
		idx++;
	}
	void add(String name, int number, double gpa){
		Student newStu = new Student(name, number, gpa);
		stuArr[idx] = newStu;
		idx++;
	}

	Student findBy(String name){
		for(int i = 0; i < stuArr.length; i++){
			if(name.equals(stuArr[i].name))
				return stuArr[i];
			
		}
		return null;
	}
	Student findBy(int number){
		for(int i = 0; i < stuArr.length; i++){
			if(number == stuArr[i].number)
				return stuArr[i];
			
		}
		return null;
	}
	Student findBy(double gpa){
		for(int i = 0; i < stuArr.length; i++){
			if(gpa == stuArr[i].gpa)
				return stuArr[i];
			
		}
		return null;
	}
	Student findBy(FindGPAParam param, double gpa){
		switch(param){
			case LOWER_THAN:
				for(int i = 0; i < stuArr.length; i++){
					if(gpa > stuArr[i].gpa)
						return stuArr[i];
				}
				return null;
			case HIGHER_THAN:
				for(int i = 0; i < stuArr.length; i++){
					if(gpa < stuArr[i].gpa)
						return stuArr[i];
				}
				return null;
		}
		return null;
	}
}