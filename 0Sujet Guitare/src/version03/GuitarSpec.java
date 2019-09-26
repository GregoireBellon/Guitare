package version03;

public class GuitarSpec {
	private Type type;
	private Builder builder;
	private String model;
	private Wood backwood;
	private Wood topwood;
	private int num_corde;

	public GuitarSpec(int num_corde, Type type, Builder builder, String model, Wood backWood, Wood topWood) {
		this.type=type;
		this.builder=builder;
		this.model=model;
		this.backwood=backWood;
		this.topwood=topWood;
		this.num_corde=num_corde;
	}
	
	public boolean matches;
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
	
	public int getNumCorde() {
		return num_corde;
	}
}
