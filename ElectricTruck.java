package vehicle;

public class ElectricTruck extends Truck{
	
	private int milageRange;
	
	public ElectricTruck() {
		super();
		this.milageRange = 0;
	}
	
	public ElectricTruck(String make, String model, int productionYear, int maxTransportWeight, int milageRange) {
		super(make, model, productionYear, maxTransportWeight);
		this.milageRange = milageRange;
	}
	
	public ElectricTruck(ElectricTruck otherElectricTruck) {
		this(otherElectricTruck.make, otherElectricTruck.model, otherElectricTruck.productionYear,
				otherElectricTruck.maxTransportWeight, otherElectricTruck.milageRange);
	}
	
	public void setMilageRange(int milageRange) {
		this.milageRange = milageRange;
	}
	
	public int getMilageRange() {
		return this.milageRange;
	}
	
	@Override
	public String toString() {
		return super.toString() + " and can travel " + this.milageRange + "(kilometres) when fully charged."; // fixed typo in kilomeres - tommy
	}
	
	@Override
	public boolean equals(Object otherObject) {
		if (otherObject == null)
			return false;
		
		if (this.getClass() != otherObject.getClass())
			return false;
		
		ElectricTruck otherElectricTruck = (ElectricTruck) otherObject;
		
		return this.make.equals(otherElectricTruck.make) &&
        		this.model.equals(otherElectricTruck.model) &&
        		this.productionYear == otherElectricTruck.productionYear &&
        		this.maxTransportWeight == otherElectricTruck.maxTransportWeight &&
        		this.milageRange == otherElectricTruck.milageRange;
	}
	}

