
public class Cars {
	String Brand;
	String Model;
	int price;
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
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cars [Brand=" + Brand + ", Model=" + Model + ", price=" + price + "]";
	}
	public Cars(String brand, String model, int price) {
		super();
		Brand = brand;
		Model = model;
		this.price = price;
	}

}
