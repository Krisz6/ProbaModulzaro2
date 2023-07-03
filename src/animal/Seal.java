package animal;

public class Seal extends Animal {
    public Seal(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Fóka hang: morog meg köhög meg ilyenek.");
    }
}
