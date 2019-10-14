public class Lesson01Task3 {
    public static void main(String[] args) {
        int[] M = {8, 5, 3, 4, 16, 6, 7, 11, 9, 3};
        int max = M[0];
        int min = M[0];

        for (int i = 0; i <= 9; i++) {
            if (max < M[i]) {
                max = M[i];
            }

            if (min > M[i]) {
                min = M[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
