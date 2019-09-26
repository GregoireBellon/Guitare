package version04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
		guitars.add(new Guitar(serialNumber, price, spec));
	}
	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type,int numcorde, Wood backwood,
			Wood topwood) {
		addGuitar(serialNumber, price, new GuitarSpec(builder, model, type, numcorde, backwood, topwood));
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

	/**
	 * Récupère la guitar équivalente à celle entrée en paramètre.
	 * @param searchGuitar guitar recherchée
	 * @return
	 */
	public List<Guitar> search(GuitarSpec searchGuitar) {
		List<Guitar> matchingGuitars = new ArrayList<>();
		
		for(Guitar iterator: guitars) {
			if(searchGuitar.equals(iterator.getSpec())) {
				matchingGuitars.add(iterator);
			}
		}
		return matchingGuitars;
	}
	
	private static void initializeInventory(Inventory inventory) {
	    inventory.addGuitar("11277", 3999.95,
	      new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6,
	                     Wood.INDIAN_ROSEWOOD, Wood.SITKA));
	    inventory.addGuitar("V95693", 1499.95,
	      new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
	                     Wood.ALDER, Wood.ALDER));
	    inventory.addGuitar("V9512", 1549.95,
	      new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
	                     Wood.ALDER, Wood.ALDER));
	    inventory.addGuitar("122784", 5495.95,
	      new GuitarSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC, 6,
	                     Wood.MAHOGANY, Wood.ADIRONDACK));
	    inventory.addGuitar("76531", 6295.95,
	      new GuitarSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC, 6,
	                     Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
	    inventory.addGuitar("70108276", 2295.95,
	      new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, 6,
	                     Wood.MAHOGANY, Wood.MAHOGANY));
	    inventory.addGuitar("82765501", 1890.95,
	      new GuitarSpec(Builder.GIBSON, "SG '61 Reissue", Type.ELECTRIC, 6,
	                     Wood.MAHOGANY, Wood.MAHOGANY));
	    inventory.addGuitar("77023", 6275.95,
	      new GuitarSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC, 6,
	                     Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
	    inventory.addGuitar("1092", 12995.95,
	      new GuitarSpec(Builder.OLSON, "SJ", Type.ACOUSTIC, 12,
	                     Wood.INDIAN_ROSEWOOD, Wood.CEDAR));
	    inventory.addGuitar("566-62", 8999.95,
	      new GuitarSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC, 12,
	                     Wood.COCOBOLO, Wood.CEDAR));
	    inventory.addGuitar("6 29584", 2100.95,
	      new GuitarSpec(Builder.PRS, "Dave Navarro Signature", Type.ELECTRIC,
	                     6, Wood.MAHOGANY, Wood.MAPLE));
	}
	
}
