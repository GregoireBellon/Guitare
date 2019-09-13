package version03;

public class Guitar {
	
	private String serialNumber;
	private double price;
	private GuitarSpec spec;
	
	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backwood,
			Wood topwood) {
		this.serialNumber = serialNumber;
		this.price = price;
		spec = new GuitarSpec(type, builder, model, backwood, topwood);

	}

	public String getSerialNumber() {
		return serialNumber;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public GuitarSpec getSpec() {
		return spec;
	}


	
	
}
