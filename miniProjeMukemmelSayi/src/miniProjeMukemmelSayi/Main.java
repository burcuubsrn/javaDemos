package miniProjeMukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int number = 27;
		int total = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				// System.out.println(i);
				total = total + i;

			}

		}
		if (total == number) {
			System.out.println("Sayınız mükemmel");
		} else {
			System.out.println("Sayınız mükemmel değil");
		}

	}

}
