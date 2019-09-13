package version03;

import java.util.ArrayList;
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
	
}
