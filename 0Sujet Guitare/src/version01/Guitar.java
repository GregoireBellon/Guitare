package version01;

public class Guitar {
	
	private String serialNumber;
	private String type;
	private String builder;
	private String model;
	private String backwood;
	private String topwood;
	private double price;
	
	public Guitar(String serialNumber, double price, String builder, String model, String type, String backwood,
			String topwood) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.model = model;
		this.builder = builder;
		this.type = type;
		this.backwood = backwood;
		this.topwood = topwood;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public String getType() {
		return type;
	}

	public String getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public String getBackwood() {
		return backwood;
	}

	public String getTopwood() {
		return topwood;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
