package loopDemo;

public class Main {

	public static void main(String[] args) {
//loop döngü demektir.
		// for
		for (int i = 1; i <= 10; i++) { // 1 den 10 a kadar sayıları yazdıran döngü
			System.out.println(i);
			/*
			  for (int i = 1; i <=10; i+=2) { // 1 den 10 a kadar tek sayıları yazdıran döngü 
			  System.out.println(i);
			 */
			/*
			  for (int i = 2; i <=10; i+=2) { // 1 den 10 a kadar çift sayıları yazdıran döngü
			  System.out.println(i);
			 */
			
		}	
		System.out.println("For Döngüsü Bitti");
		int i = 1;
		// while
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		// infinite loop sonsuz döngü demek
		System.out.println("While Döngüsü Bitti");
		// do while döngüsü
		int j=100;
		do {
			System.out.println(j);
			j++;
		} while (j < 10);
		System.out.println("Do-While Döngüsü Bitti");

	}

}



