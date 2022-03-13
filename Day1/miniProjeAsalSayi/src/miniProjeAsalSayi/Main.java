package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 1;
		
		int remainder = number % 2; // remainder = kalan demektir %=mod demektir
		
		System.out.println(remainder);
		
		boolean isPrime = true; // sayıyı asal kabul etme
		
//asal sayı bulma
		if(number==1) {
			
			System.out.println("Sayı asal değildir");
			return; //bitirme işlemine yarar
		}
		if(number<1) {
			
			System.out.println("Geçersiz sayı");
		}
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false; // sayıyı 2 ye bölerse asal değil
			}
		}
		if (isPrime) { // ==true ile aynı anlama gelir
			
			System.out.println("Sayı asaldır");
			
		} else {
			
			System.out.println("Sayi asal degildir.");
		}
	}

}
