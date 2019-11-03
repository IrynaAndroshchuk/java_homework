package Lesson13.Task1;

public class Helm {
    private int diameter;
    private String material;

    public Helm(int diameter, String material) {
        this.diameter = diameter;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "diameter=" + diameter +
                ", material='" + material + '\'' +
                '}';
    }
}