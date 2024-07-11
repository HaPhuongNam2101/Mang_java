public class Min {
    public static void main(String[] args) {
        int[] arr = {8, 9, 12, 2, 16, 4, 6,};
        int minIndex = minValue(arr);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + arr[minIndex]);
    }

    public static int minValue(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}

