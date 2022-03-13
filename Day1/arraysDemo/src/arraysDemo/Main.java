package arraysDemo;

public class Main {

	public static void main(String[] args) {
String ogrenci1="Serhat";
String ogrenci2="Ali";
String ogrenci3="Mert";

System.out.println(ogrenci1);
System.out.println(ogrenci2);
System.out.println(ogrenci3);

System.out.println("-------------------");

String[] ogrenciler = new String[4];
ogrenciler[0]="Serhat";
ogrenciler[1]="Ali";
ogrenciler[2]="Mert";
ogrenciler[3]="Ahmet";
//ogrenciler[4]="Mehmet";


for(int i = 0; i<ogrenciler.length;i++) {
	System.out.println(ogrenciler[i]);
}
System.out.println("-------------------");

for(String ogrenci:ogrenciler) {
	System.out.println(ogrenci);
}

	}

}
