package animal;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    private final String name;
    private List<String> nicknames;
    private static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        this.nicknames = new ArrayList<>();
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public List<String> getNicknames() {
        return nicknames;
    }

    public void setNicknames(List<String> nicknames) {
        this.nicknames = nicknames;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public static void setAnimalCount(int animalCount) {
        Animal.animalCount = animalCount;
    }

    public void addNickname(String nickname) {
        nicknames.add(nickname);
    }

    public void makeSound() {}

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", nicknames=" + nicknames +
                '}';
    }
}

