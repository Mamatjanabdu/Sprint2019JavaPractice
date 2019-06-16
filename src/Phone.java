
public class Phone {

	
		// TODO Auto-generated method stub
		 /*
	     * Create class Phone
	     * add few instance variable to define   attribute | properties| state of object 
	     * type as String , OS as String , capacity as int 
	     * add few methods 
	     * ring--->> accept no param return no value, just print ringing
	     * dial--->> accept one param number as long and print dialing number
	     * create 3 different phone object , iphone, sumsung , pixel 
	     * assign value for all attributes 
	     * 
	     * OPTIONALLY 
	     *   add a behavior to Phone object  
	     *   displayPhoneInfo method accept no param return no value 
	     *   --> this should print all phone attributes 
	     *   
	     */
	  
  String brand;
  String OS;
  int capacity;

  public void ring() {
    System.out.println("ringing");
  }

  public void dial(long number) {
    System.out.println("dialing " + number);
  }
  
  public void displayBrand() {
    
    System.out.println("brand: "+  brand );
    
	}
}
