package Lesson08_SOLID;

public class AirplaneControl {
    public int up() {
        return this.random();
    }

    public int down() {
        return this.random();
    }

    public int left() {
        return this.random();
    }

    public int right() {
        return this.random();
    }

    private int random() {
        return Random.randomInt(1, 150);
    }
}
