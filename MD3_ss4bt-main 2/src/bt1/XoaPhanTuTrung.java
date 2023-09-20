package bt1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XoaPhanTuTrung {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5,5};

        // Tạo một danh sách để lưu trữ các phần tử duy nhất
        List<Integer> uniqueList = new ArrayList<>();

        // Duyệt qua từng phần tử trong mảng
        for (int num : arr) {
            // Kiểm tra xem phần tử đã tồn tại trong danh sách chưa
            if (!uniqueList.contains(num)) {
                uniqueList.add(num); // Nếu chưa tồn tại, thêm vào danh sách
            }
        }

        // Chuyển danh sách thành mảng
        int[] newArr = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            newArr[i] = uniqueList.get(i);
        }

        // In mảng mới sau khi loại bỏ các phần tử trùng
        System.out.println(Arrays.toString(newArr));
    }
}
