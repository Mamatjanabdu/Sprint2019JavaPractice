package Days4;

public interface Teachable {

	public static final boolean STUDY_HARD =true; 
	public abstract void canLearn();
	public abstract void doHomeWork();
	
	public default void readTopics() {
		
	}
	
	public static int doResearch() {
		return 0;
		
	}
}