package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'P';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok iyi : Geçtiniz");
			break;
		case 'C':
		case 'D':
			System.out.println("İdare Eder : Geçtiniz");
			break;
		case 'F':
			System.out.println("Malesef : Kaldınız");
			break;
		default:
			System.out.println("Geçersiz Not");

		}

	}

}
