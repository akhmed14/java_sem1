package seminar1.hw2;

public class hw2 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 5,-1};
        System.out.println(sumNum(myArray));
    }

    public static int sumNum(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count = count + array[i - 1];
            }
        }
        return count;
    }
}
