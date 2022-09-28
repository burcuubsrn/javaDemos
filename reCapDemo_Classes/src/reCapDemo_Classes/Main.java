package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(5, 10);
		System.out.println(sonuc);
		
		int sonuc2 = dortIslem.Carp(5, 10);
		System.out.println(sonuc2);
		
		int sonuc3 = dortIslem.Cikar(5, 10);
		System.out.println(sonuc3);
		
		int sonuc4 = dortIslem.Bol(5, 10);
		System.out.println(sonuc4);

	}

}
