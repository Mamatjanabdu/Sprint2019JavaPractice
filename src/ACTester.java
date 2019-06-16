
public class ACTester {

	public static void mian (String [] args) {
		
		 
	    AirConditioner ac = new AirConditioner(); 
	    ac.brand= "Samsung" ; 
	        ac.currentTemp=79.7f;
	        ac.isOn=true;
	        
	        ac.displayBrand();;
	        ac.displayAllInfo();
	        
	        ac.turnOff();
	        ac.turnOn();
	        ac.showCurrentTemp();
	       
		
		
		
		
		
		
		
		
		
	}
	
}
