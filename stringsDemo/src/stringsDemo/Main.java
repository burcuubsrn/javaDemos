package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String konu = ("Java dilini öğreniyorum.");
		System.out.println(konu);

		System.out.println("Eleman Sayısı: " + konu.length());
		System.out.println("4.Eleman: " + konu.charAt(3));
		System.out.println(konu.concat(" Nesne yönelimli programlamadır."));
		System.out.println(konu.startsWith("J"));
		System.out.println(konu.endsWith("r"));
		char[] karakterler = new char[11];
		konu.getChars(5, 11, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(konu.indexOf("d"));
		System.out.println(konu.lastIndexOf("i"));

		String newmessage = konu.replace(" ", "-");
		System.out.println(newmessage);
		System.out.println(konu.substring(12, 24));

		for (String word : konu.split(" ")) {
			System.out.println(word);
		}

		System.out.println(konu.toUpperCase());
		System.out.println(konu.toLowerCase());
		//System.out.println(konu.trim());

	}

}
