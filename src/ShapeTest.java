import java.util.ArrayList;
import java.util.Collection;

public class ShapeTest

{
	public static void main(String[] args)
	{
		twoTimes();
		twoTimes.add(1);
		twoTimes.add(2);
	}
	//create your method below
public static ArrayList<Integer> twoTimes(){
	  ArrayList<Integer> newR= new ArrayList<>();
	
	newR.addAll(r);
	  int j=0;
	  for(int i=0; i<r.size();i++){
		  newR.add(i+j,r.get(j));
		  j++;
	  }
	
	  return newR; 
	}
}