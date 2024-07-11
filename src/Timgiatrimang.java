import java.util.Scanner;

public class Timgiatrimang {
    public static void main(String[] args) {
        String[] students = {"Hà", "Linh", "Hưng", "Trung", "Nam"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên học sinh: ");
        String name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Vị trí của học sinh trong danh sách " + name + " là: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy " + name + " trong danh sách.");
        }
    }
}
