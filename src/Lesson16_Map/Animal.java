package Lesson16_Map;

public class Animal {
    String animalName;
    String type;

    public Animal(String animalName, String type) {
        this.animalName = animalName;
        this.type = type;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
