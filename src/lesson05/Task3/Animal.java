package lesson05.Task3;

public class Animal {
    private String name;
    private int speed;
    private int old;

    public Animal(String name, int speed, int old) {
        this.name = name;
        this.speed = speed;
        this.old = old;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getOld() {
        return old;
    }
}


