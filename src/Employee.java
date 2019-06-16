import java.util.*;
class fields{
	
	
	public class Job {
		private String title;
		private String company;
		private int annualSalary;
		
		
		
		
		public Job() {
			System.out.println("Constructor");
			
		}
		
		public String getTitle() {
			return title;
		}
		
		public void setTitle(String title) {
		this.title=title;
		}
		
		public String getCompany() {
			return title;
		}
		
		public void setCompany(String company) {
		this.company=company;
		}
		
		public int getAnnualSalary() {
			return annualSalary;
		}
		
		public void setAnnualSalary(int annualSalary) {
		this.annualSalary=annualSalary;
		}
		
		public String toString() {
			String s="Title: " +title+", Company: "+company+", Annual Salary "+annualSalary;
			return s;
		}

	
	/*
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("Nurses "));
	}
	 Job class
	 *
	 *   private fields 
	     title , company , annualSalary
	 *
	 *   Encapsulate above private instance fields
	 *   Create no arg constructor -- constructor with no parameter
	 *       to set title to “undefined”
	      to set company to “unknown”
	   
	   -- constructor with 1 parameter   
	 *   Create 1 arg constructor to set title  
	 *  -- constructor with 3 parameters   
	    Create 3 arg constructor to set all 3 fields
	 *
	 
	 *   create a method called toString
	 *   it accepts no parameters and
	 *   return concatenation of all field value in nice format
	 *
	   
	   Inside another class Called JobSeeking with main method 
	 
	 *   Create few job objects and and add it to ArrayList<Job> object
	 *   iterate over all items and print them out
	 *
	 * */
	
	}