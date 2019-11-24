package Lesson16_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooClub {
    Map<Person, List<Animal>> map = new HashMap<>();

    public void addPerson(Person person) {
        map.put(person, new ArrayList<>());
    }

    public void addAnimal(Person person, Animal animal) {
        List<Animal> animals = map.get(person);
        animals.add(animal);
    }

    public void printMap() {
        System.out.println(map);
    }

    public Person getKeyByIndex(int index) throws Exception {
        int i = 1;

        for (Map.Entry<Person, List<Animal>> entry : map.entrySet()) {
            if (i == index) {
                return entry.getKey();
            }
            i++;
        }

        throw new Exception("Person not found");
    }

    public void printPersons() {
        int i = 1;

        for (Person person : map.keySet()) {
            System.out.println(i + ". " + person);
            i++;
        }
    }

    public void removeAnimal(Person person, int index) {
        List<Animal> animals = map.get(person);
        animals.remove(index);
    }

    public void printAnimals(Person person) {
        List<Animal> animals = map.get(person);
        for (Animal animal : animals) {
            System.out.print(animals.indexOf(animal));
            System.out.println(". " + animal);
        }
    }

    public void removePerson(Person person) {
        map.remove(person);
    }
}
