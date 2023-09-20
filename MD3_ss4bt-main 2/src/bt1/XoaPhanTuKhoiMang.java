package bt1;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] newArr = new int[arr.length - 1];

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào vị trí index bạn muốn xóa: ");
        int index  = Integer.parseInt(sc.nextLine());

        for(int i=0;i<newArr.length;i++) {
            if(i < index) {
                newArr[i] = arr[i];
            }
            if(i >= index) {
                newArr[i] = arr[i + 1];
            }
        }

        System.out.println(Arrays.toString(newArr));
    }


}