package vehicle;

public class Vehicle {

	// instance variables

	protected int plateNumber;
	protected String make;
	protected String model;
	protected int productionYear;
	
	// default constructor

	public Vehicle() {
		this.make = null;
		this.model = null;
		this.productionYear = 0; // changed from productionYear to 0 - tommy
	}
	
	// parameterized constructor

	public Vehicle(String make, String model, int productionYear) {
		this.make = make;
		this.model = model;
		this.productionYear = productionYear;
	}
	
	// copy constructor 

	public Vehicle(Vehicle otherVehicle) {
		this(otherVehicle.make, otherVehicle.model, otherVehicle.productionYear); // idk what this line does tbh, looks like a copy constructor tho - tommy
	}
	
	public String getMake() {
		return this.make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getProductionYear() {
		return this.productionYear;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}
	
	@Override
	public String toString() {
		return "The Vehicle with model " + this.model + " and make " + this.make + ", with plate number " + this.plateNumber + " was made on the year " + this.productionYear; // added this.model, think was forgotten - tommy
	}
	
	@Override // idk what's happening here - tommy
	public boolean equals(Object otherObject) {
		// CHeck if parameter is null
        if (otherObject == null) {
            return false;
        }

        // Check if otherObject is referencing an object Student
        if (this.getClass() != otherObject.getClass()) { // not sure if i understand this line but it seems copy pasted from another assignment :) - tommy
            return false;
        }
        
        Vehicle otherVehicle = (Vehicle) otherObject;
        
        return this.make.equals(otherVehicle.make) &&
        		this.model.equals(otherVehicle.model) &&
        		this.productionYear == otherVehicle.productionYear;
        
	}
}

