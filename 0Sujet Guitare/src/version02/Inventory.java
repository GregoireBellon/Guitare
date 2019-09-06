package version02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backwood,
			Wood frontwood) {
		guitars.add(new Guitar(serialNumber, price, builder, model, type, backwood, frontwood));
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	public Guitar search(Guitar searchGuitar) {
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			// Ignore serial number since that's unique
			// Ignore price since that's unique
			Builder builder = searchGuitar.getBuilder();
			if ((builder != null)  && (!builder.equals(guitar.getBuilder())))
				continue;
			String model = searchGuitar.getModel();
			if ((model != null) && (!model.equals("")) && (!model.equalsIgnoreCase(guitar.getModel())))
				continue;
			Type type = searchGuitar.getType();
			if ((type != null) && (!type.equals(guitar.getType())))
				continue;
			Wood backwood = searchGuitar.getBackwood();
			if ((backwood != null) && (!backwood.equals(guitar.getBackwood())))
				continue;
			Wood topwood = searchGuitar.getTopwood();
			if ((topwood != null) && (!topwood.equals(guitar.getTopwood())))
				continue;
			return guitar;
		}
		return null;
	}

}
