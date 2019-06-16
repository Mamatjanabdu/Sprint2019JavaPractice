package day47;

public class Airplane extends Vehicle{

	
	private int wingCount;

	public Airplane(String brand, String model, int year, int wingCount) {
		super(brand, model, year);
		this.wingCount = wingCount;
	}

	


	public int getWingCount() {
		return wingCount;
	}




	public void setWingCount(int wingCount) {
		this.wingCount = wingCount;
	}



	

	public String toString() {
		return "Airplane [wingCount=" + wingCount + ", brand=" + getBrand() + ",model=" + getModel()
				+ ", year=" + getYear() + "]";
	}
	
	public static void main (String [] args) {
		
		Airplane a=new Airplane("Mazda", "honda",2099,8);
		
		System.out.println(a);
	}
	
	
	class Person {

		   private String firstName;
			  private String lastName ;
			  private int age;
			  
			public String getFirstName() {
				return firstName;
			}
			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}
			public String getLastName() {
				return lastName;
			}
			public void setLastName(String lastName) {
				this.lastName = lastName;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			
			public String toString() {
				return  firstName + "|" + lastName + "|" + age ;
			}
			public Person() {
				
				this(firstName, lastName, age);
				
				
			}
			public Person(String firstName, String lastName, int age) {
			
				this.firstName = firstName;
				this.lastName = lastName;
				this.age = age;
			}
			  
			
			  
		}
		  
	
	//Vehicle v1=new Vehicle("ss","")
	
//	
//	public Airplane(String brand, String model, int year) {
//		super(brand, model, year);
//		
//	}

	
	
	  

