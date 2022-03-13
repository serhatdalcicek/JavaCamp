package classesWithAttributes;

//product ürün
//private sadece tanımlandığı blokta geçerli demektir
//get getirme
//set değer verme
//constructor yapıcı demek
public class Product {
	public Product(int id,String name,String description,double price,int stockAmount,String renk) {
		System.out.println("Yapıcı blok çalıştı");
		this.id=id;
		this.renk=renk;
		this.price=price;
		this.description=description;
		this.stockAmount=stockAmount;
	}
	public Product() {
		
	}
	// attribute | field
	private int id; // tc numarası gibi
	private String name; // ürünün adı
	private String description; // ürünün açıklaması
	private double price; // ürünün fiyatı
	private int stockAmount; // stok adedi
	private String renk;	
	private String kod;
	
	//GETTER
	public int getId() {
		return id;
		
	}
	//SETTER
	public void setId(int id) {
		id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getKod() {
		return this.name.substring(0,1) + id; //kodu kullanıcının yazmasını engelledik
	}

	
}
