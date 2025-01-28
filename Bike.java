
public class Bike {
	String Brand;
	String Model;
	int Price;
	int Milage;
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getMilage() {
		return Milage;
	}
	public void setMilage(int milage) {
		Milage = milage;
	}
	@Override
	public String toString() {
		return "Bike [Brand=" + Brand + ", Model=" + Model + ", Price=" + Price + ", Milage=" + Milage + "]";
	}
	public Bike(String brand, String model, int price, int milage) {
		super();
		Brand = brand;
		Model = model;
		Price = price;
		Milage = milage;
	}

}
