package version04;

public class Guitar {
	
	private String serialNumber;
	private double price;
	private GuitarSpec spec;
	
	public Guitar(String serialNumber, double price, Builder builder, String model, Type type,int numcorde, Wood backwood,
			Wood topwood) {
		this.serialNumber = serialNumber;
		this.price = price;
		spec = new GuitarSpec(builder,model, type, numcorde, backwood, topwood);
	}

	public Guitar(String serialNumber, double price, GuitarSpec spec) {
		this.serialNumber=serialNumber;
		this.price=price;
		this.spec=spec;
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
	
	public boolean matches() {
		return false;
	}

	
	
}
