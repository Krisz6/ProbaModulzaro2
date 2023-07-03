package animal;

import java.util.ArrayList;
import java.util.List;

public class CircusAnimal {
    public static void main(String[] args) {

        Elephant elephant = new Elephant("Picúr");
        Lion lion = new Lion("Zordon");
        Seal seal = new Seal("Jámbó Zimmy");

        elephant.addNickname("Nagyúr");
        elephant.addNickname("Zokni");
        lion.addNickname("Ori");
        seal.addNickname("Fóki");

        List<Animal> animals = new ArrayList<>();
        animals.add(elephant);
        animals.add(lion);
        animals.add(seal);

        for (Animal animal : animals) {
            System.out.println("Állat neve: " + animal.getName());
            System.out.println("Állat beceneve: " + animal.getNicknames());
            animal.makeSound();
            System.out.println();
        }
        System.out.println("Állatok száma: " + Animal.getAnimalCount());
    }
}
