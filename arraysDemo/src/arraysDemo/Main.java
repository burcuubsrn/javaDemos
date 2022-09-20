package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String student1 = "Berk";
		String student2 = "Burcu";
		String student3 = "Burak";
		String student4 = "Büşra";

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);

		System.out.println("----------------------------------------------");

		String[] students = new String[4];
		students[0] = "Berk";
		students[1] = "Burcu";
		students[2] = "Burak";
		students[3] = "Büşra";
		//students[4] = "Esma";

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);

		}

		System.out.println("----------------------------------------------");

		for (String student : students) {
			System.out.println(student);
		}

	}

}
