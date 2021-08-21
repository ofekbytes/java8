package ofekbytes.java8.Lambda_Expression;

public class Product {

	private String id; // product id
	private String name; // product name
	private String manufacturer; // product manufacture factory
	private int model; // product model
	private String color; // product color
	private String size; // product size (xs, s, m, l, xl, xxl)
	private int quality; // product quality
	private int quantity; // total product amount available
	private long price; // product price

	public Product() {
	}

	public Product(String id, String name, String manufacturer, int model, 
			       String color, String size, int quality, int quantity, long price) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.model = model;
		this.color = color;
		this.size = size;
		this.quality = quality;
		this.quantity = quantity;
		this.price = price;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}

}
