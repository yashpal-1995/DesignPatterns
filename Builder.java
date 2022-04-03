package practice.lld.machine.coding;

import practice.lld.machine.coding.Vehicle.VehicleBuilder;

/**
 * Builder Design pattern 
 * when there are too many arguments in constructor, 
 * it's difficult to remember or maintain the order
 * Obervation: sometimes it's not necessary to put all the params in constructor always 
 * Ex: Sometimes only two are required field out of 10 params
 * @author Yash
 * Problem: we cannot use setter method approach here because with setter method, 
 * object could be modify after it is created using setter call and would no longer remain immutable.
 *Advantage :
 *1. Complex object construction become more readable and easy.
  2. No need to pass optional parameters in creating the object.
 */
class Vehicle{
	
	// required paramter
	private String engine;
	private int wheels;
	
	//optional
	private int airbags; 
	
	// private constructor : so that we can create instance through vehicleBuilder class
	private Vehicle(VehicleBuilder builder) {
		this.engine = builder.engine;
		this.wheels = builder.wheels;
		this.airbags = builder.airbags;
	}
	// only have getters
	// no setter : sp we can't change the values { immutable }
	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getAirbags() {
		return airbags;
	}
	// public static nested class so we can call it from outside
	// contains all the arguments of outer class
	public static class VehicleBuilder{
		
		private String engine;
		private int wheels;
		
		private int airbags;
		// public constructor got required params
		public VehicleBuilder(String engine, int wheels){
			this.engine = engine;
			this.wheels = wheels;
		}
		// setter method for optional params 
		public VehicleBuilder setAirbags(int airbags) {
			this.airbags = airbags;
			return this;
		}
        // it returns the final vehicle instance
		public Vehicle build(){
			return new Vehicle(this);
		}
	}

}
public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Vehicle car = new Vehicle.VehicleBuilder("2500cc",4).setAirbags(4).build();
		
		Vehicle bike = new Vehicle.VehicleBuilder("250cc",2).build();
		
		System.out.println(car.getEngine() + " "+ car.getWheels() + " "+ car.getAirbags());
		
		System.out.println(bike.getEngine() + " "+ bike.getWheels() + " "+bike.getAirbags());
	}

}
