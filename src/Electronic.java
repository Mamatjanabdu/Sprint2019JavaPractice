


	public abstract class Electronic {

		  public abstract void turnOn(); 

		  public static void main(String[] args) {
		    
		    /*
		     * create List of Electronic with random 10 items 
		     * turn them all on 
		     * 
		     * find out how many computer and how many AirConditioner are there
		     * 
		     * */
		    
		  }
		  
		}

		class Computer extends Electronic{
		    @Override
		  public void turnOn() {
		    System.out.println("Turning on computer");
		  }
		}

		class AirConditioner extends Electronic{

		  @Override
		  public void turnOn() {
		    System.out.println("Turning on AirConditioner");
		  }
		  
		}

