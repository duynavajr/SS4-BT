package bt9;

import java.util.Scanner;

public class PhanTuLonThu2TrongMang {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 7, 5, 8, 1, 9, 6,9,9, 3};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int max = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] < max) {
                System.out.println("Số lớn thứ 2 là : " + arr[i]);
                break;
            }
        }
    }
}