import java.util.*;
public class Task1 {

	public static Integer main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 * ***	Task 1 
Create an ArrayList object and add 5 whole numbers

try out adding one by one 
and also try adding in one shot 

update each number to doule of that number  1,3,5,6,7 --> 2 6 10 12 14

// reverse this ArrayList using one of the utility method that we learned from Collections class

OPTIONALLY Reverse this ArrayList not using above method 
	 */
		
		ArrayList<Integer> nums= new ArrayList<>();
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		
		ArrayList<Integer> nums1= new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8));
		
//		for (Integer each : nums) {
//		//	each=2*each;
//					
//		}
//		System.out.println(each);
//		
		 
	    int[] nums = {1,4,6,7,2} ; 
	    // updating using for each loop  will not work 
	    for (int each : nums) {
	      each = 100 ; 
	    }
	    
	    // because for each loop get the copy of value inside collection
	    // rather than original value 
	    for (int i = 0; i < nums.length; i++) {
	      int each = nums[i];
	      each = 100; 
	    }
	    
	    System.out.println(Arrays.toString(nums));
	    
	    
	    
	    
	    
	    
	    
	    


		
	}

}
