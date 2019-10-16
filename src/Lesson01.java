public class Lesson01 {
    public static void main(String[] args) {
        int a, b, c;
        a = 1;
        b = 3;
        c = 2;

        double x1 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double x2 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        System.out.println(x1);
        System.out.println(x2);
    }
}
