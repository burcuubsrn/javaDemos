package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] numbers = new int[] { 1, 3, 5, 7, 9 };
		int find = 11;
		boolean varMi = false;

		for (int number : numbers) {
			if (number == find) {
				varMi = true;
			}

		}
		if (varMi) {
			mesajVer("Sayınız mevcuttur: " + find);
		} else {
			mesajVer("Sayınız mevcut değildir: " + find);
		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}

}
