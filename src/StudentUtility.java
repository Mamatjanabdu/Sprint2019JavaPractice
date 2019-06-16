import java.util.*;
public class StudentUtility {

	

		  // create a private static field called studentList as ArrayList of String
		  private static ArrayList<String> studentList;

		  // create a static block to print out welcome to StudentsUtility
		  static {
		    System.out.println("Welcome to  StudentsUtility");
		  }

		  // create another static block
		  // initialize your arrayList object
		  // add 10 students
		  static {

		    studentList = new ArrayList<String>();
		    studentList.add("Abdul Kahn");
		    studentList.add("Nurilla");
		    studentList.add("Odiljan");
		    studentList.add("Ansar");
		    studentList.add("Muhammad");
		    studentList.add("Ali");
		    studentList.add("Erdem");
		    studentList.add("Muratbek");
		    studentList.add("Marat");
		    studentList.add("Kubanych");

		  }

		  
		  public static void main(String[] args) {
		    
		    System.out.println(  studentList    );
		    
		  }

		  // create a static method called displayAllStudent , accept no param return
		  // nothing

		  // create a static method called addStudent , accept one parameter as String
		  // name
		  // and add that name to the list , return no value

		  // create a static method called updateStudent
		  // accept 2 params index as int , newName as String
		  // and it will update the name of student at that location

		  // create a static method called removeStudent
		  // accept 1 param index as int
		  // and it will remove the name of student at that location

		  // create a static method called resetTheList
		  // accept no param and delete everything in the list

		}


	
	
	

