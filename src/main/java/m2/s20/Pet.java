package m2.s20;

public class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    //Getter -> accedono a proprietà private
    public String getName() {
        return name;
    }
}