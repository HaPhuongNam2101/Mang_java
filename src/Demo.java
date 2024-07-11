import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        /*
        Mảng: là 1 biến đặc biệt tham chiếu đến 1 danh sách các phần tử liên quan đến nhau
        Mảng trong Java là mảng tĩnh, không thể thay đổi length và không có các hàm có sẵn như JS
        ArrayList
        */
        int[] numbers = {3, 4, 6, 10, 20};
        // Index          0  1  2   3   4
        // Phần tử là các giá trị nằm tại vị tr tương ứng: numbers[0]
        System.out.println("Phần tử số 0: " + numbers[0]);
        System.out.println("Độ dài mảng: " + numbers.length);
        // Cách duyệt mảng
        System.out.println("Duyệt mảng: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Phần tử tại vị trí " + i + " là: " + numbers[i]);
        }
        // For each
        System.out.println("--------------");
        System.out.println("Duyệt mảng bằng for each: ");
        for (int item : numbers) {
            System.out.println("Phần tử: " + item);
        }
        System.out.println("------------------");
        double[] numbers2 = new double[10];
        /*
        Khi khởi tạo theo kiểu trên, giá trị của các phần tử là giá trị mặc định tương ứng ới kiểu dữ liệu
        Vd: double: 0.0, int: 0, boolean: false, String: null,......
        */
        System.out.println(Arrays.toString(numbers2));
        }
        // Tạo tay các hàm thêm, chèn,  sửa, xóa phần tử 1 mảng trong java
    }

