package m2.s17;

public class Poodle extends Dog {
	private static final int DEFAULT_DENSITY = 3;
	private int curlDensity; // = 0
	
	public Poodle() {
		super();
		this.curlDensity = DEFAULT_DENSITY; //Costruendo si va a settare questa nuova costante -> nuova proprietà dell'istanza corrente
	}

	public Poodle(String name) {
		super(name); //Qui la curlDensity sarà uguale a zero
	}

	public Poodle(String name, int weight, int curlDensity) {
		super(name, weight); //Fanno parte della classe cane
		this.curlDensity = curlDensity;
	}
	
	public Poodle(String name, int weight) {
		this(name, weight, DEFAULT_DENSITY);
	}

	@Override
	public String getName() {
		return "Poodle " + super.getName();
	}
	
	@Override
	public String toString() {
		return "Poodle " + super.toString() + " " + curlDensity;
	}
}
