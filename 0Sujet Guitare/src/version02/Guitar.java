package version02;

public class Guitar {
	
	private String serialNumber;
	private Type type;
	private Builder builder;
	private String model;
	private Wood backwood;
	private Wood topwood;
	private double price;
	
	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backwood,
			Wood topwood) {
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

	public Type getType() {
		return type;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Wood getBackwood() {
		return backwood;
	}

	public Wood getTopwood() {
		return topwood;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
