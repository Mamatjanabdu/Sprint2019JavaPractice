import java.util.*;
public class SlackAction
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SlackUser s1= new SlackUser();
		System.out.println(s1.toString());
		
		SlackUser s2= new SlackUser("Ahmatjan","momsfavour@gmail.com",34);
		
		ArrayList <SlackUser > userList= new ArrayList <>();
		userList.add(s1);
		userList.add(s2);
		System.out.println("-------------------------");
		for (SlackUser each : userList) {
			System.out.println(each);
			each.sendMessage("general", "good morning");
		}
			
		}
		
		
	}
	/*optionally , 
	create a ArrayList of SlackUser add all the objetcs 
	loop through each item and print out 
	and call sendMessage on each of them 
	*/

