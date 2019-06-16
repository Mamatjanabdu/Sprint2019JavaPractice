

	public class ParkingMeter{
//		  // Two instance variables named timeLeft and maxTime of type int. 
//		  // The value of timeLeft should be initialized to 0.
//		  private int timeLeft;
//		  private int maxTime;
//		  
//		  // A constructor accepting a single integer parameter whose value
//		  // is used to initialize the maxTime instance variable.
//		  public ParkingMeter(int maxTime){
//		    this.maxTime = maxTime;
//		  }
//		  
//		  // A method named add that accepts an integer parameter.
//		  
//		  public boolean add(int value){
//		    //If the value of the parameter is equal to 25, 
//		    //the value of timeLeft is increased by 30
//		    //the increase occurs only 
//		    //if the value of timeLeft will not exceed the value of maxTime
//		    if(value==25&&(timeLeft+30)<=maxTime){
//		      timeLeft+=30;
//		      //true if timeLeft was increase,
//		      return true;
//		    }
//		    //false otherwise.
//		    return false;
//		  }
//		  //A method named tick that accepts no parameters and returns no value.
//		  public void tick(){
//		    //tick decreases the value of timeLeft by 1, but only if the value of timeLeft is greater than 0.
//		    if(timeLeft>0){
//		      this.timeLeft--;
//		    }
//		  }
//		// A method named isExpired that accepts no parameters.
//		  public boolean isExpired(){
//		    //true if the value of timeLeft is equal to 0; false otherwise.
//		    return timeLeft == 0;
//		  }
      }
	
	 public class GasTank {
  //WRITE YOUR CODE HERE
  //by default 0.0;
  //instance variables must be private
  //it will work without private
  //but, it's bad implementation of OOP (int this case encapsulation). 
  //encapsulation encourage us to make instance variables private
  //static variables are mostly public.
  private double amount;
  private double capacity;
  
  //A constructor that accepts a parameter of type double. 
  //The value of the parameter is used 
  //to initialize the value of capacity.
  public GasTank(double capacity){
    this.capacity=capacity;
  }
  
  //A method named addGas that accepts a parameter of type double.
  public void addGas(double gas){
    if((gas+amount)>capacity){
      //However, if the value of amount is increased beyond the value of capacity, amount is set to capacity.
      amount = capacity;
    }else{
      //The value of the amount instance variable is increased by the value of the parameter.
      amount+=gas;
    }
  }
  
  public void useGas(double gas){
    //the amount instance variable 
    //is decreased by the value of the parameter. 
    this.amount-=gas;
    //However, if the value of amount is decreased below 0, 
    //amount is set to 0.
    if(amount<0){
      amount=0;
    }
  }
  
  public boolean isEmpty(){
    //true if the value of amount is less than 0.1, and false otherwise.
    return this.amount<0.1;
  }
  
  public boolean isFull(){
    //true if the value of amount is greater than capacity-0.1, 
    //and false otherwise
    return amount > (capacity-0.1);
  }
  
  public double getGasLevel(){
    return this.amount;
  }
  
  // fillUp increases amount to capacity and 
  //returns the difference between the value of capacity 
  //and the original value of amount
  public double fillUp(){
    // difference between the value of capacity 
    double difference = capacity - amount;
    // fillUp increases amount to capacity and 
    this.amount = this.capacity;
    return difference;
  }
}
	 
