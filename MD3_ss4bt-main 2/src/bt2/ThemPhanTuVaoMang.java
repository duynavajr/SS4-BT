package bt2;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng số nguyên
        int[] array = {1,2,3,4,5,6,7,8};
        int n = array.length;
        // Bước 2: nhập giá trị cần chèn
        System.out.print("nhập giá trị cần chèn: ");
        int X = scanner.nextInt();
        // Bước 3: nhập vị trí index cần chèn X vào
        System.out.print("nhập vị trí index cần chèn (từ 0 đến " + (n - 1) + "): ");
        int index = scanner.nextInt();
        // Bước 4: Kiểm tra vị trí index hợp lệ
        if (index < 0 || index >= n) {
            System.out.println("Không thể chèn phần tử vào vị trí này.");
        } else {
            // Bước 5: Thực hiện chèn phần tử X vào mảng
            for (int i = n - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = X;
            n++; // Tăng kích thước mảng sau khi chèn
            // Bước 6: In ra mảng sau khi chèn
            System.out.println("Mảng sau khi chèn phần tử " + X + " vào vị trí " + index + ":");
            for (int i = 0; i < n-1; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
