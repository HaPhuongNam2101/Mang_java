import java.util.Scanner;
public class Xoa {
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
        System.out.print("Nhập phần tử cần xóa: ");
        int X = scanner.nextInt();
        int index_del = -1;
        for (int i = 0; i < N; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }

        if (index_del == -1) {
            System.out.println("Phần tử " + X + " không có trong mảng.");
        } else {

            for (int i = index_del; i < N - 1; i++) {
                array[i] = array[i + 1];
            }
            N--;
            System.out.print("Mảng sau khi xóa phần tử " + X + ": ");
            for (int i = 0; i < N; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }


    }
}
