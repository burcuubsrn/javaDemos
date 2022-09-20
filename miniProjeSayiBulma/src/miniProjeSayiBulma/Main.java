package miniProjeSayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 3, 5, 7, 9 };
		int find = 11;
		boolean varMi = false;

		for (int number : numbers) {
			if (number == find) {
				varMi = true;
			}

		}
		if (varMi) {
			System.out.println("Sayınız mevcuttur");
		} else {
			System.out.println("Sayınız mevcut değildir");
		}

	}

}
