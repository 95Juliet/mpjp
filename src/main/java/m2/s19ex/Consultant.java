package m2.s19ex;

//Classe derivata da Person
public class Consultant extends Person {
    private int daily;

    public Consultant(String firstName, String lastName, int daily) {
        super(firstName, lastName);
        this.daily = daily;
    }

    //Getter -> permette di accedere a dati privati
    public int getDaily() {
        return daily;
    }

    @Override
    //Questo metodo può essere generato in automatico da Ecplipse
    public String toString() {
        return "Consultant " + super.toString() + ": daily bill is " + daily;
    } //super.toString() è l'unico modo per vedere firstName e lastName di un Consultant
}
