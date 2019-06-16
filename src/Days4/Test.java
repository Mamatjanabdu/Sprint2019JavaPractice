package Days4;

public class Main {
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String model = scan.next();
	    int year = scan.nextInt();
	    boolean recalled = false;

	if  ( (model.equals(model“Extravagant”)&& (year>=2010&&year<=2012) )||
	        ( model.equals(“Guzzler”)&& (year>=2015&&year<=2018) ) ){
	        System.out.println(!recalled);
	        }else{
	            System.out.println(recalled);
	            
	}
	}
	}