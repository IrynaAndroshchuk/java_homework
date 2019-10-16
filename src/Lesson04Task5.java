public class Lesson04Task5 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        System.out.println("P = " + rec1.p());
        System.out.println("S = " + rec1.s());

        Rectangle rec2 = new Rectangle(7, 13);
        System.out.println("P = " + rec2.p());
        System.out.println("S = " + rec2.s());
    }
}