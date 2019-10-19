package lesson05.Task2;

public class Wheel {
    private int diameter;

    public Wheel(int diameter) {
        this.diameter = diameter;
    }

    public void changeSize(int size) {
        this.diameter = this.diameter - size;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                '}';
    }
}
