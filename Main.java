public class Main{
	public static void main(String[] args){
		StudentDB stuDB = new StudentDB();
		Student stu1 = new Student("Kim Jiu", 201911111, 4.01);

		stuDB.add(stu1);
		stuDB.add("Lee Minjun", 201922222, (double)3.85);
		stuDB.add("Park Seoyun", 201933333, (double)3.90);

		System.out.println(stuDB.findBy("Kim Jiu"));
		System.out.println(stuDB.findBy(201922222));
		System.out.println(stuDB.findBy(3.90));
		System.out.println(stuDB.findBy(stuDB.findGPA.LOWER_THAN, 3.95));
		System.out.println(stuDB.findBy(stuDB.findGPA.HIGHER_THAN, 3.95));
	}
}