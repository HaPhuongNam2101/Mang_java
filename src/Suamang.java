import java.util.Scanner;
public class Suamang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int N = scanner.nextInt();
        int[] array = new int[N];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Nhập phần tử cần sửa: ");
        int X = scanner.nextInt();
        int index_sua = -1;
        for (int i = 0; i < N; i++) {
            if (array[i] == X) {
                index_sua = i;
                break;
            }
        }

        if (index_sua == -1) {
            System.out.println("Phần tử " + X + " không có trong mảng.");
        } else {
            System.out.print("Nhập giá trị mới cho phần tử " + X + ": ");
            int newValue = scanner.nextInt();
            array[index_sua] = newValue;

            System.out.print("Mảng sau khi sửa phần tử " + X + ": ");
            for (int i = 0; i < N; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}