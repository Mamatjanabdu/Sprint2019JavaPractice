
public class Course {

	  public static String school ; 
	  public static boolean isRamadan; 
	 public Course() {
		 System.out.println("Constructor");
	 }
	  
	  // static initilizer block 
	 //it will only run once when the class is loaded
	  // iT'S used to initilize the static fields value before 
	  // the type's first usage 
	  // and it will run only one time righ before it's usage
	  
	  static {
		  school = "Cybertek School" ; 
		  System.out.println("WELCOME TO OUR SCHOOL : " + school );
		    System.out.println("LET THE JOURNEY BEGIN");
	  }
	  
	  static {
	   
	    isRamadan = true ; 
	    
	   
	    if(isRamadan) {
	      System.out.println("Use ramadan schedule");
	    }else {
	      System.out.println("USE normal schedule");
	    }
	  
	  
	  }

	}


