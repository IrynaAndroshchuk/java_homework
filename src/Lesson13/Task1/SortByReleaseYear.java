package Lesson13.Task1;

import java.util.Comparator;

public class SortByReleaseYear implements Comparator<Car> {

    @Override
    public int compare(Car car, Car car2) {
        return car.getReleaseYear() - car2.getReleaseYear();
    }
}
