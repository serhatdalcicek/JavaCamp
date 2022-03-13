package stringDemo;

public class Main {
//stringler bir karakter dizisidir.
	public static void main(String[] args) {
		String mesaj = "Bugün hava cok güzel.";
		
		System.out.println(mesaj);
		
		/*System.out.println("Eleman sayisi : " +mesaj.length()); //length = uzunluk
		
		System.out.println("5. eleman : " +mesaj.charAt(4)); //charAt = belirtilen elemanı yakalar
		
		System.out.println(mesaj.concat(" Yasasin!")); //concat = ekleme yapar
		
		System.out.println(mesaj.startsWith("B")); //değerin ne ile başladığını true yada false olarak çıktı almanı sağlar.
		
		
		System.out.println(mesaj.endsWith(".")); //değerin ne ile bittiğini true yada false olarak çıktı almanı sağlar
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5,karakterler,0);
		
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("av"));//''char ""string indexOf = belirtilen değerin kaçıncı sırada olduğunu bulur
		
		System.out.println(mesaj.lastIndexOf('a'));//lastIndexOf =  aramaya sağdan başlar*/
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj); //replace = değiştirme
		
		System.out.println(mesaj.substring(2,5));// bir metinin içerisinden parça almak
		
		for(String kelime : mesaj.split(" ")) { //split =bir metini karakter veya karakter dizisini alarak parçalamaya yarar
			System.out.println(kelime);
			
			
		}
		System.out.println(mesaj.toLowerCase()); // kelimeleri küçük yapar
		System.out.println(mesaj.toUpperCase()); // kelimeleri büyük yapar
		System.out.println(mesaj.trim()); //değerdeki boşlukları siler
	}

}
