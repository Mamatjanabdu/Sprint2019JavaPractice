import java.util.ArrayList;
import java.util.List;

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
	
	void code () {
		if(each instanceof Computer)
		
		System.out.println("print coding");
	}
void controlTemp() {
	if(each instanceof AirConditioner )
	System.out.println("controlling temp");
}



List<Electronic> allItems = new ArrayList<>() ; 

//Electronic item1 = new Computer();
//Electronic item2 = new AirConditioner();
//Electronic item3 = new Computer();
//Electronic item4 = new Computer();
//Electronic item5 = new Computer();
//Electronic item6 = new AirConditioner();
//Electronic item7 = new Computer();
//Electronic item8 = new Computer();

allItems.add(new AirConditioner());
allItems.add(new Computer());
allItems.add(new Computer());
allItems.add(new Computer());
allItems.add(new AirConditioner());
allItems.add(new Computer());
allItems.add(new AirConditioner());
allItems.add(new Computer());
allItems.add(new AirConditioner());

int cntComputer = 0;
int cntAC = 0;

for(Electronic each : allItems ) {
  
  each.turnOn();
  
  if(each instanceof Computer) {
    cntComputer ++ ;         
  
  }else if(each instanceof AirConditioner ) {

    cntAC++;
  }
  
}
System.out.println( "compurer count : " + cntComputer );
System.out.println( "AC count : " +  cntAC );


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

