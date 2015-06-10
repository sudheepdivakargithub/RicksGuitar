public abstract class Instrument {

	public String serialNumber;
	public double price;
	public InstrumentSpec spec;

	public Instrument(String serialNumber, double price, InstrumentSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public InstrumentSpec getSpec() {
		return spec;
	}

}
