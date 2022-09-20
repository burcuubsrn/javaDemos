package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] degrees = { 22.3, 30.2, 27.5, 34.1 };
		double total = 0;
		double max = degrees[0];
		for (double degree : degrees) {
			if (max < degree) {
				max = degree;
			}
			total = total + degree;
			System.out.println(degree);
		}

		System.out.println("Toplam: " + total);
		System.out.println("En Büyük: " + max);

	}

}
