

	
	
public abstract class Shape implements Drawable {

	  String color;

	  public abstract double calculateArea();

	  public abstract String toString();
}

/*

Task 2

  
    Task 2 
    
    
    Create an interface called Drawable 
      with below members
      
        constant DRAWING_TOOL  
        abstract method draw 
        
        default method drawLine  accept one int as line count and print drawing n line 
        
        static method printDrawingTool accept no arg and return nothing 
        
    
    Abstract class called Shape , implements Drawable 
      it has instance fields 
        color 
        
      it has abstract method calculateArea 
      it has abstract method toString 
      
    
    Create a concrete Shape class called -- Triangle 
    
      it has height , base   -->> formula to calculate area base * height / 2 
      it has constructor to set all the values 
      
      create a constructor to set all the value 
      
      override all the abstract method that you inherited
      
    
    Optionally create Square -- sub class of Shape 
      it has sizeLength 
      
      create a constructor to set all the fields 
      implemenet all the unimplemented methods 
      
      
      Eventually in main method create few objects and call their methods 
    
      
  
      
      
    
    
    
    
    
    
    
    
    
    
    
    
    */