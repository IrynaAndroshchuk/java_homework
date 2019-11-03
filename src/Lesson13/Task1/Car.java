package Lesson13.Task1;

public class Car {
    private int horsepower;
    private int releaseYear;

    Helm helm = new Helm(12, "material");
    Engine engine = new Engine(4);

    public Car(int horsepower, int releaseYear) {
        this.horsepower = horsepower;
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "horsepower=" + horsepower +
                ", releaseYear=" + releaseYear +
                ", helm=" + helm +
                ", engine=" + engine +
                '}';
    }
}
 