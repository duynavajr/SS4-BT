package bt6;

import java.util.Scanner;
public class TinhTongCacSoCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng: ");
        int numRows = scanner.nextInt();

        System.out.print("Nhập số cột: ");
        int numCols = scanner.nextInt();

        // Khởi tạo mảng hai chiều và nhập giá trị từ người dùng
        double[][] arr = new double[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Nhập giá trị cho [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextDouble();
            }
        }

        // Hiển thị mảng
        System.out.println("Mảng bạn đã nhập là:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Yêu cầu người dùng nhập vào cột muốn tính tổng
        System.out.print("Nhập số cột bạn muốn tính tổng: ");
        int colToSum = scanner.nextInt();

        // Tính tổng của cột đó
        double sum = 0;
        for (int i = 0; i < numRows; i++) {
            sum += arr[i][colToSum];
        }

        // In kết quả
        System.out.println("Tổng của cột " + colToSum + " là: " + sum);

        scanner.close();
    }
}
