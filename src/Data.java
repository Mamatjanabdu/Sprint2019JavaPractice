
public class Data {

	String name; 
	int studyHour; 
	int horsePower; 
	boolean tired; 
	String[] certificates; 

	// this no arg constructor should set default value for name, studyHour , horsePower
	// this no arg constructor should set default value for name, 
	// studyHour , horsePower
	public Data() {

		this("No Name", 5); 

		System.out.println("no arg");

		this("No Name", 5); 	
		System.out.println("no arg");		
//		this.name = "No Name";
//		this.studyHour = 5; 

		this.horsePower = 320; 
		//this.certificates = new String[] {"OCA","OCP"}; 		
	}


	public Data(String name, int studyHour) {
		this.name = name; 
		this.studyHour = studyHour; 
	}

	}	
	// CREATE A CONSTRUCTOR THAT TAKE ONE ARG boolean tired
	// inside this constructor 
	//  call the constructor that that take 5 args
		// to set all your default value 

		// to set all your default value 	
	public Data(boolean tired) {

		this("spartan", 12, 700, tired, null); 
	}


	}

}
