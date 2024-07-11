import java.util.Scanner;
public class Tongsocot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng : ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột : ");
        int cols = sc.nextInt();
        double[][] matrix = new double[rows][cols];

        System.out.println("Nhập các phần tử :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử tại hàng " + i + " cột " + j + ": ");
                matrix[i][j] = sc.nextDouble();
            }
        }
        System.out.print("Nhập số cột muốn tính tổng : ");
        int cotCanTinhTong = sc.nextInt();
        double tongCot = 0;
        for (int i = 0; i < rows; i++) {
            tongCot += matrix[i][cotCanTinhTong];
        }
        System.out.println("Tổng của cột " + cotCanTinhTong + " là: " + tongCot);
    }
}