
public class Excute extends PaperBook {

	public static void main(String[] arr) {
		// TODO Auto-generated method stub

		
		
		AudioBook a1 = new AudioBook();
	    a1.author = "Java";
	    a1.audioLength = 3; 
	    a1.chapterCount = 7 ; 
	    a1.pageCount = 300 ; 
	    a1.price = 12.99;
	    a1.printAuthor();
	    a1.play();
	    
	    boolean   bValue =  9 > 10  || 10 > 9;
	    PaperBook p1 = new PaperBook();
	    p1.author = "Suzanne Collins";
	    p1.author = "song of ice and fire"; 
	    p1.chapterCount = 34;
	    p1.wight = 0.750;
	    p1.hardcover = true;
	    int  num =  '9';
	    double  num  =  9L;
	}

}
