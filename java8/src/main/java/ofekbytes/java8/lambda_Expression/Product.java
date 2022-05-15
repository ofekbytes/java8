package ofekbytes.java8.lambda_Expression;

public class Product {

	/// /// /// product_id, product_name.....
	private String id;
	private String name;
	private String manufacturer;
	private int model;
	private String color;
	private String size; // s, m, l, xl
	private String quality; // a, b, c...
	private int quantity;
	private long price;

	public Product(String id, String name, String manufacturer, int model, String color, String size, String quality,
			int quantity, long price) {
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

	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getManufacturer() {
		return manufacturer;
	}

	public final void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public final int getModel() {
		return model;
	}

	public final void setModel(int model) {
		this.model = model;
	}

	public final String getColor() {
		return color;
	}

	public final void setColor(String color) {
		this.color = color;
	}

	public final String getSize() {
		return size;
	}

	public final void setSize(String size) {
		this.size = size;
	}

	public final String getQuality() {
		return quality;
	}

	public final void setQuality(String quality) {
		this.quality = quality;
	}

	public final int getQuantity() {
		return quantity;
	}

	public final void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public final long getPrice() {
		return price;
	}

	public final void setPrice(long price) {
		this.price = price;
	}

	public String toString() {
		return " id: " + this.id + " name: " + this.name + " manufacturer: " + this.manufacturer + " model: "
				+ this.model + " color: " + this.color + " size: " + this.size + " quality: " + this.quality
				+ " quantity: " + this.quantity + " price: " + this.price;
	}

	public void toStringFormated() {
		System.out.printf(
				"\r\nid: %-5s , name: %-15s , manufacturer: %-15S , model: %-5d , color: %-10s ,  size: %-5s , quality: %-5s ,  quantity: : %-5d , price: %-5d ",
				this.id, this.name, this.manufacturer, this.model, this.color, this.size, this.quality, this.quantity,
				this.price);
	}
}
