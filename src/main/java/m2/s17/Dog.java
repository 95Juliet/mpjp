package m2.s17;

public class Dog {
	private static final String DEFAULT_NAME = "???";
	private static final int DEFAULT_WEIGHT = 7;

	private String name;
	private int weight;

	//I primi tre costruttori richiamano il costruttore base
	public Dog() {
		this(DEFAULT_NAME, DEFAULT_WEIGHT);
	}
	
	public Dog(String name) {
		this(name, DEFAULT_WEIGHT);
	}

	public Dog(int weight) {
		this(DEFAULT_NAME, weight);
	}
	
	//Caso normale
	public Dog(String name, int weight) {
		this.name = name; //si associa alla proprietà name dell'oggetto corrente la stringa name
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

    @Override
    public String toString() {
        return "S75Dog [name=" + name + ", weight=" + weight + "]";
    }
}
