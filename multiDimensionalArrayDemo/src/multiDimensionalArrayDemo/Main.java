package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[2][2];

		sehirler[0][0] = "Giresun";
		sehirler[0][1] = "Trabzon";
		sehirler[1][0] = "Kütahya";
		sehirler[1][1] = "Eskişehir";

		for (int i = 0; i <= 1; i++) {
			System.out.println("----------------------------------");
			for (int j = 0; j <= 1; j++) {
				System.out.println(sehirler[i][j]);
			}

		}

	}

}
