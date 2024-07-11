import java.util.Scanner;
public class Them {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int N = scanner.nextInt();
        int[] array = new int[N + 1];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Nhập giá trị cần thêm : ");
        int X = scanner.nextInt();
        System.out.print("Nhập vị trí cần thêm : ");
        int index = scanner.nextInt();
        if (index < 0 || index > N) {
            System.out.println("Không thể thêm phần tử vào vị trí này.");
        } else {
            for (int i = N; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = X;



            System.out.print("Mảng sau khi chèn: ");
            for (int i = 0; i <= N; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

    }
}


