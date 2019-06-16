
public class Square extends Shape {


		  int sizeLength;

		  
		  public Square(String color,int sizeLength) {
		    
		    this.color = color; 
		    this.sizeLength = sizeLength;
		  }

		  @Override
		  public void draw() {
		    System.out.println("draw Shape of Square");
		    
		  }

		  @Override
		  public double calculateArea() {
		    //System.out.println(sizeLength * sizeLength);
		    return sizeLength * sizeLength ; 
		  }

		  @Override
		  public String toString() {
		    System.out.println("toString method is here for Shape");
		    return null;
		  }
		  
		  

		}

