package bt4;

import java.util.Arrays;

public class TimPTLonNhatMang2Chieu {
    public static void main(String[] args) {

        int[][] arr2 = {
                {1, 2, 3, 3},
                {9, 8, 6, 2},
                {5, 6, 3, 4}
        };
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        int max = arr2[0][0];  // tạo biến max =  phần tử thứ 0.0 của mảng

        for (int i = 0; i < arr2.length; i++) {   // duyệt mảng 2 chiều
            for (int j = 0; j < arr2[i].length; j++) {
                if (max < arr2[i][j]) { // so sánh từng phần tử với biến max
                    max = arr2[i][j];    // nếu phần tử lớn hơn biến max sẽ gán max = phần tử đó.
                }
            }
        }
        System.out.println("phẩn tử lớn nhất trong mảng 2 chiều cho sẵn là : " + max);
    }
}
