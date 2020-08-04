package m2.s03;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[6]; //creazione array di 6 cani - non ancora inseriti, è stato solo allocato lo spazio in memoria

        dogs[0] = new Dog("Bob");
        for (int i = 1; i < dogs.length; i++) {
            dogs[i] = new Dog(); //tutti i cani creati con questo costruttore si chiameranno "No name"
        }

        dogs[0].bark();
        dogs[dogs.length - 1].bark();
    }
}
