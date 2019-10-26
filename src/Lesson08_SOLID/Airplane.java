package Lesson08_SOLID;

public abstract class Airplane {
    private int length;
    private int width;
    private int weight;

    public Airplane(int length, int width, int weight) {
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public void startingEngines() {
        System.out.println("Ready in " + Random.randomInt(20, 88));
    }

    public void airplaneTakeOff() {
        System.out.println("Distance " + Random.randomInt(0, 1000));
    }

    public void planeLanding() {
        System.out.println("The airplane is landing");
    }
}
