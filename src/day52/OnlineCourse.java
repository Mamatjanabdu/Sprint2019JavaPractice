package day52;

public class OnlineCourse extends Course{
	
	
	int capacity = 300;
	
	
	public static void main(String []arg) {
		
//		Course java =new Course();
//		System.out.println(   java.capacity);
		OnlineCourse sdet= new OnlineCourse();
		//System.out.println( sdet.capacity);
		sdet.showCapacity();
		
	}
	
	public void showCapacity() {
		System.out.println(  capacity);
		System.out.println(  this.capacity);
		System.out.println(  super.capacity);
	}
	
    System.out.println("-------------------");
    

}
