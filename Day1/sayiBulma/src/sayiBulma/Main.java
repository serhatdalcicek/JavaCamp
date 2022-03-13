package sayiBulma;

public class Main {

	public static void main(String[] args) {
int[] sayilar = new int[] {1,2,5,7,9,0};
int aranacak = 4;
boolean varMi = false;

for (int sayi : sayilar) {
	if(sayi==aranacak) {
		varMi = true;
		break;
		//System.out.println("Sayı mevcuttur");
	}
}
if(varMi) {
	System.out.println("Sayi mevcuttur");
}else {
	System.out.println("Sayi mevcut değildir.");
}
	}

}
