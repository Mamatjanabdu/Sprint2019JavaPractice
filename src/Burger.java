
public  class Burger implements Edible {

	
	
	
	String name;
    int size;

@Override
public void eat() {
	System.out.println("Spartan is eating");
}

public Burger(String name, int size) {
	this.name=name;
	this.size=size;
}
@Override
public String toString() {
	return "Burger [name=" + name + ", size=" + size + "]";
}

}
