public class Circle {
    private double r;
    private double d;

    public Circle(double r) {
        this.r = r;
        this.d = 2 * r;
    }

    public double s() {
        return (Math.PI * Math.pow(d, 2)) / 4;
    }

    public double l() {
        return 2 * Math.PI * r;
    }
}
