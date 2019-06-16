
public class SlackUser {

   private String name;
    private String email;
    private int groupName;
    
    
    
	public SlackUser() {
		this("mamatjan", "balabala@gmail.com",37);
	}




	public SlackUser(String name,String email,int groupName) {
		this.name=name;
		this.email=email;
		this.groupName=groupName;
		
	}




	public String toString() {
		return "SlackUser [name=" + name + ", email=" + email + ", groupName=" + groupName + " ]     ";
	}

    public void sendMessage (String channel, String content) {
    	System.out.println(name+" sent message "+content+" to channel "+channel);
    }




	

    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public int getGroupName() {
		return groupName;
	}




	public void setGroupName(int groupName) {
		this.groupName = groupName;
	}
    
	
   /* Create a class called SlackUser
	private fields  name , email , groupNum
	
	provide getters and setters for above fileds 
	
	create 3 args constructor to set all the field value

	create no arg constructor to set default value 
		by calling 3 args constructor 
		you may set default value to your own info 

	create toString method accept no arg 
		return info about the slack user object 

	create a method called sendMessage
	accept two parameters 
		  channel as string , content as String 
	it just print out User <your name>
			sent message <content> to channel <channel>
*/
}
