package lesson05.Task2;

public class Car {
    private String color;
    private Helm helm;
    private Wheel wheel;
    private Body body;

    public Car(String color, Helm helm, Wheel wheel, Body body) {
        this.color = color;
        this.helm = helm;
        this.wheel = wheel;
        this.body = body;
    }

    public void upgrade() {
        this.color = "Red";
        this.helm.less(2);
        this.wheel.changeSize(-2);
        this.body.changeType("coupe");
    }

    public String getColor() {
        return color;
    }

    public Helm getHelm() {
        return helm;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public Body getBody() {
        return body;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Car{" + "color='" + color + '\'' +
                ", helm=" + helm +
                ", wheel=" + wheel +
                ", body=" + body +
                '}';
    }
}
 