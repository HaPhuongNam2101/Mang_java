import java.util.Scanner;
public class Demsolankytu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        System.out.print("Nhập ký tự cần đếm: ");
        char kyTu = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự '" + kyTu + "' trong chuỗi là: " + count);
    }
}

