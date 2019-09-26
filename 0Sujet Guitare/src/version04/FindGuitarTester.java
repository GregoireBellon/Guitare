package version04;
import version04.*;

import java.util.Iterator;
import java.util.List;

import version03.Builder;
import version03.Guitar;
import version03.GuitarSpec;
import version03.Inventory;
import version03.Type;
import version03.Wood;

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventaire = new Inventory();
		initializeInventory(inventaire);

		GuitarSpec whatErinLikes = new GuitarSpec(Type.ELECTRIC,Builder.FENDER, "Stratocastor", Wood.ALDER, Wood.ALDER);
		List<Guitar> guitars = inventaire.search(whatErinLikes);
		if (!guitars.isEmpty()) {
			System.out.println("Erin, you might like this :");
			for (Guitar guitar : guitars) {
				System.out.println(guitar.getSpec().getBuilder() + " " + 
						guitar.getSpec().getModel() + " " + 
						guitar.getSpec().getType() +
					    " Guitar:\n   " + guitar.getSpec().getBackwood() + 
						" back and sides,\n   " + guitar.getSpec().getTopwood() +
					    " top.\nYou can have it for only $" + 
						guitar.getPrice() + "!\t\n");
			}

		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}	

	public static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("11277", 3999.95,
				new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6, Wood.INDIAN_ROSEWOOD, Wood.SITKA));
		inventory.addGuitar("V95693", 1499.95,
				new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER));
		inventory.addGuitar("V9512", 1549.95,
				new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER));
		inventory.addGuitar("122784", 5495.95,
				new GuitarSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC, 6, Wood.MAHOGANY, Wood.ADIRONDACK));
		inventory.addGuitar("76531", 6295.95,
				new GuitarSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC, 6, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
		inventory.addGuitar("70108276", 2295.95,
				new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, 6, Wood.MAHOGANY, Wood.MAHOGANY));
		inventory.addGuitar("82765501", 1890.95,
				new GuitarSpec(Builder.GIBSON, "SG '61 Reissue", Type.ELECTRIC, 6, Wood.MAHOGANY, Wood.MAHOGANY));
		inventory.addGuitar("77023", 6275.95,
				new GuitarSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC, 6, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
		inventory.addGuitar("1092", 12995.95,
				new GuitarSpec(Builder.OLSON, "SJ", Type.ACOUSTIC, 12, Wood.INDIAN_ROSEWOOD, Wood.CEDAR));
		inventory.addGuitar("566-62", 8999.95,
				new GuitarSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC, 12, Wood.COCOBOLO, Wood.CEDAR));
		inventory.addGuitar("6 29584", 2100.95,
				new GuitarSpec(Builder.PRS, "Dave Navarro Signature", Type.ELECTRIC, 6, Wood.MAHOGANY, Wood.MAPLE));
	}
}
