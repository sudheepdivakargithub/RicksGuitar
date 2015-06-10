import java.util.*;

public class Inventory {

	private List<Instrument> inventory;

	public Inventory() {
		inventory = new ArrayList<Instrument>();
	}

	public void addInstrument(String serialNumber, double price,
			InstrumentSpec spec) {
		Instrument instrument = null;
		if (spec instanceof GuitarSpec) {
			instrument = new Guitar(serialNumber, price, (GuitarSpec) spec);

		} else if (spec instanceof MandolinSpec) {
			instrument = new Mandolin(serialNumber, price, (MandolinSpec) spec);

		}

		inventory.add(instrument);
	}

	public Instrument get(String serialNumber) {
		for (Iterator<Instrument> i = inventory.iterator(); i.hasNext();) {
			Instrument instrument = (Instrument) i.next();
			if (instrument.getSerialNumber().equals(serialNumber)) {
				return instrument;
			}
		}
		return null;
	}

	
	public List<Guitar> search(GuitarSpec searchSpec)
	{
		List<Guitar> matchingGuitars = new ArrayList<Guitar>();
		for(Iterator<Instrument> i=inventory.iterator();i.hasNext();)
		{
			Guitar guitar = (Guitar)i.next();
			if(guitar.getSpec().matches(searchSpec))
				matchingGuitars.add(guitar);
			
		}
		return matchingGuitars;
	}
	
	public List<Mandolin> search(MandolinSpec searchSpec)
	{
		List<Mandolin> matchingMandolins = new ArrayList<Mandolin>();
		for(Iterator<Instrument> i=inventory.iterator();i.hasNext();)
		{
			Mandolin mandolin = (Mandolin)i.next();
			if(mandolin.getSpec().matches(searchSpec))
				matchingMandolins.add(mandolin);
			
		}
		return matchingMandolins;
	}
}
