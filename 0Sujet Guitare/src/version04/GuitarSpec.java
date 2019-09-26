package version04;

public class GuitarSpec {
	
	public final int no_pref_string = -1;
	private Type type;
	private Builder builder;
	private String model;
	private Wood backwood;
	private Wood topwood;
	private int num_corde;

	public GuitarSpec(Builder builder, String model, Type type,int numcorde, Wood backwood,
			Wood topwood) {
		this.type=type;
		this.builder=builder;
		this.model=model;
		this.backwood=backwood;
		this.topwood=topwood;
		this.num_corde=num_corde;
	}
	
	public boolean matches(GuitarSpec other) {
		
		if(other.model!=null && !other.model.equals(this.model)) return false; 
		if(other.builder!=null && other.builder!=this.builder) return false;
		if(other.backwood!=null && other.backwood!=this.backwood) return false;
		if(other.topwood!=null && other.topwood!=this.topwood) return false;
		if(other.type!=null && other.type!=this.type) return false;
		if(other.num_corde!=no_pref_string && other.num_corde!=this.num_corde) return false;

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
	
	public int getNumCorde() {
		return num_corde;
	}
}
