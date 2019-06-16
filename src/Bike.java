public class Bike{

	private String brand;
	private int gear;
	private int spead;
	private int id;
	
	public static int countOfBike;
	
	
	public String getBrand() {
		return brand;
	}
	public int getGear() {
		return gear;
	}
	public int getSpead() {
		return spead;
	}
	public int getId() {
		return id;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public void setSpead(int spead) {
		this.spead = spead;
	}
	
	public Bike(String brand, int gear, int spead) {
		this();
		
		this.brand = brand;
		this.gear = gear;
		this.spead = spead;
		++countOfBike;
		this.id+=countOfBike;
	}
	public Bike() {
		
	}
	
	public void speedUp (int increaseBy) {
		spead=spead+ increaseBy;
		
	}
	
	public void slowDown (int decreaseBy) {
		spead=spead- decreaseBy;
		
	}
	public String toString() {
		return "Bike [brand=" + brand + ", gear=" + gear + ", spead=" + spead + ", id=" + id + "]";
	}
	
	public static void showCurrentCount() {
		System.out.println("Current count of Object is "+ countOfBike);
	}
	

}
/*
WARM UP 
	Create a class called Bike 
		private instance fileds : brand, gear, speed , id
		private static field : countOfBike 

		provide getters for all instance fields 
		privide setters for brand, gear, speed

		create 3 args constructors 
			to set brand, gear, speed
			and keep the count of objects here
			set the id value by the count of object to stimulate incremented ID for each objects 
			call your no arg constructor in here

		create private no arg constructor  
			print out no arg is being called 

	create instance methods
			speedUp : accept one increaseBy as int 
					return nothing , it will increase current speed by the amount provided

			slowdown : accept one decreaseBy as int 
					return nothing , it will decrease current speed by the amount provided
			toString method as usual 

	create static methods showCurrentCount
		accept no arg and just print out static variable count 
	
	
	*/
	
	
	

