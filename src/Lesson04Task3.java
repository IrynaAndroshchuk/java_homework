public class Lesson04Task3 {
    public static void main(String[] args) {
        int[] Arr = {8, 5, 3, 4, 16, 6, 7, 11, 9, 3};
        int max = Arr[0];
        int min = Arr[0];

        for (int i = 0; i <= 9; i++) {
            if (max < Arr[i]) {
                max = Arr[i];
            }

            if (min > Arr[i]) {
                min = Arr[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
