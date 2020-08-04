package m2.s20;

public class Main {
    public static void main(String[] args) {
//		Cat cat = (Cat) new Dog(); -> sidecast -> non supportato da Java

        Pet pet = new Dog("Bob"); //Upcast -> non si potrà accedere ai metodi della classe Dog

        // risky
        Dog dog = (Dog) pet; //Downcast -> deve essere esplicitao
        dog.bark(); //In questo modo l'oggetto può accedere ai metodi di Dog

        // next line leads to a ClassCastException
//        Cat cat = (Cat) pet; -> eccezione -> sidecast non supportato
        // next line is just not to have a warning for unused cat on the previous line
//        System.out.println(System.identityHashCode(cat));

        //Per evitare errori si utilizza l'operatore instanceof
        if (pet instanceof Cat) {
            Cat tom = (Cat) pet;
            tom.meow();
        } else {
            System.out.println("This pet is not a cat!");
        }

        Pet[] pets = { new Dog("Tom"), new Cat("Bob") };

        f(pets); 
    }

    static void f(Pet[] pets) {
        
    	//Check null
    	if(pets == null) {
        	return;
        }
    	
    	for (Pet pet : pets) {
            if (pet instanceof Dog) {
                Dog dog = (Dog) pet; //Variabile locale
                dog.bark();
            }
            if (pet instanceof Cat) {
                Cat cat = (Cat) pet;
                cat.meow();
//              ((Cat)pet).meow();
            }
        }
    }
}
