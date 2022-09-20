package loopDemo;

public class Main {

	public static void main(String[] args) {
		// For
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);

		}

		System.out.println("For döngüsü sonlandı");

		// While
		int i = 2;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("While döngüsü sonlandı");

		// Do-While
		int j = 100;
		do {
			System.out.println("Loglandı");
			if (j < 10) {
				System.out.println(j);
				j++;
			}
		} while (j < 10);
		System.out.println("Do-While döngüsü sonlandı");

	}

}
