package day54;

public class SoccerClub {
int playerCount;
String name;
Stadium stadium;

public SoccerClub(int playerCount, String name, Stadium stadium) {
	
	this.playerCount = playerCount;
	this.name = name;
	this.stadium = stadium;
	
}
public SoccerClub() {
	// TODO Auto-generated constructor stub
}
public int getPlayerCount() {
	return playerCount;
}
public void setPlayerCount(int playerCount) {
	this.playerCount = playerCount;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Stadium getStadium() {
	return stadium;
}
public void setStadium(Stadium stadium) {
	this.stadium = stadium;
}
@Override
public String toString() {
	return "SoccerClub [playerCount=" + playerCount + ", name=" + name + ", stadium=" + stadium + "]";
}

public static void main (String[] args) {
	
	SoccerClub s=new SoccerClub(23,"Hunter",st);
	
	System.out.println(s);
}


}


}
