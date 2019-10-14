class Rectangle {
    int length;
    int width;

    public Rectangle() {
        this.length = 16;
        this.width = 20;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int p() {
        return this.length * 2 + this.width * 2;
    }

    public int s() {
        return this.length * this.width;
    }
}

public class Lesson02Task1 {
    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        System.out.println("P = " + a.p());
        System.out.println("S = " + a.s());

        Rectangle b = new Rectangle(7, 13);
        System.out.println("P = " + b.p());
        System.out.println("S = " + b.s());
    }
}