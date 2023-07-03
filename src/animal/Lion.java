package animal;

public class Lion extends Animal{
    public Lion(String name) {
        super(name);
    }
    @Override

    public void makeSound(){
        System.out.println("Oroszlán hang: morog meg ordibál meg ilyenek.");
    }
}
