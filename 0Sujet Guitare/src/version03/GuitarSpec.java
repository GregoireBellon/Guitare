package version03;

public class GuitarSpec {
	private Type type;
	private Builder builder;
	private String model;
	private Wood backwood;
	private Wood topwood;

	public GuitarSpec(Type type, Builder builder, String model, Wood backWood, Wood topWood) {
		this.type=type;
		this.builder=builder;
		this.model=model;
		this.backwood=backWood;
		this.topwood=topWood;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GuitarSpec other = (GuitarSpec) obj;
		if (backwood != other.backwood)
			return false;
		if (builder != other.builder)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (topwood != other.topwood)
			return false;
		if (type != other.type)
			return false;
		return true;
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
	
}
