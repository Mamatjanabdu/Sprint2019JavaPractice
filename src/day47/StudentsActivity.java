package day47;



	import static day47.StudentsUtility.displayAllStudent;
	import static day47.StudentsUtility.*;
	
	public class StudentsActivity{
		
		public static void main ( String [] args) {
			
			StudentsUtility.displayAllStudent();
			
			/**displayAllStudent();
			System.out.println("-----------------");
			**/
			
			addOneStudent("Mamatjan");
			addOneStudent("Sheroz");
			displayAllStudent();
			
			System.out.println("*****************");
			
			updateStudent(11, "Sheroz Zoidov");
			displayAllStudent();

			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
			removeStudent(6);
			displayAllStudent();

			System.out.println("######################");
			resetTheList();
			displayAllStudent();
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
