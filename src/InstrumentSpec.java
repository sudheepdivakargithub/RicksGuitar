
public abstract class InstrumentSpec {

	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	
	public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood)
	{
	this.builder = builder;
	this.model = model;
	this.type = type;
	this.backWood = backWood;
	this.topWood = topWood;		
	}
	
}
