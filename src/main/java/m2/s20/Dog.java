package m2.s20;

public class Dog extends Pet {
    
	//Richiama il costruttore di Pet
	public Dog(String name) {
        super(name);
    }
    
    public void bark() {
        System.out.println("bark!");
    }
}