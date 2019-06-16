package day47;

public class StudentUser {

	public StudentUser() {
	}
		//super(); 
		// SET DEFAULT VALUE FOR //displayName,timeZone,status
		 ///-----  this is what we would do , if we want to do it directly 
//		this.displayName = "Spartan";
//		this.status = "I CAN DO IT !!"; 
//		this.timeZone = 5 ; 

	// ---- -this is how we borrowed same class's constructor fucntionlity 	
//		this("spartan", 5, "I can do it",0); 
	// --- and eventually this is how we call super class's 3 args constructor to set the values

		super("spartan", 5 , "I can do it");
	//	System.out.println("Student User no arg");
	

	public StudentUser(String displayName, int timeZone, 
					String status, int groupNumber) {
	   //super();
		 ///-----  this is what we would do , if we want to do it directly 

//	    this.displayName = displayName;
//	    this.timeZone = timeZone;
//	    this.status = status;

		// --- and eventually this is how we call 
		// super class's 3 args constructor to set the values		
		super(displayName,timeZone,status);
	    this.groupNumber = groupNumber; 
	    System.out.println("Student user 4 args is being called");
	}

	public String toString() {
		return "StudentUser [groupNumber=" + groupNumber 
				+ ", displayName=" + displayName 
				+ ", timeZone=" + timeZone
				+ ", status=" + status + "]";
	}

}