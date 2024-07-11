import java.util.Scanner;
public class Maxhaichieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

        double[][] userMatrix = new double[rows][cols];

        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử tại (" + i + ", " + j + "): ");
                userMatrix[i][j] = scanner.nextDouble();
            }
        }
        double maxValue = userMatrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < userMatrix.length; i++) {
            for (int j = 0; j < userMatrix[i].length; j++) {
                if (userMatrix[i][j] > maxValue) {
                    maxValue = userMatrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận do người dùng nhập là: " + maxValue + " tại tọa độ (" + maxRow + ", " + maxCol + ")");
    }
}
