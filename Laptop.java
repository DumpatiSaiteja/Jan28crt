
public class Laptop {
	String Brand;
	int Price;
	String Processor;
	String Ram;
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getProcessor() {
		return Processor;
	}
	public void setProcessor(String processor) {
		Processor = processor;
	}
	public String getRam() {
		return Ram;
	}
	public void setRam(String ram) {
		Ram = ram;
	}
	@Override
	public String toString() {
		return "Laptop [Brand=" + Brand + ", Price=" + Price + ", Processor=" + Processor + ", Ram=" + Ram + "]";
	}
	public Laptop(String brand, int price, String processor, String ram) {
		super();
		Brand = brand;
		Price = price;
		Processor = processor;
		Ram = ram;
	}
	

}
