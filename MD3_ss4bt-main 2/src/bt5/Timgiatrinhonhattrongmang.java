package bt5;

public class Timgiatrinhonhattrongmang {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3};

        // Giả định giá trị nhỏ nhất ban đầu là phần tử đầu tiên trong mảng
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);
    }


}