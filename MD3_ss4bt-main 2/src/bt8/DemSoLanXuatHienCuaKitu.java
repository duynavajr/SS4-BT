package bt8;

import java.util.Scanner;
public class DemSoLanXuatHienCuaKitu {
    public static void main(String[] args) {
        String str = "xin chao cac ban";
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào ký tự bạn muốn tìm: ");
        char c = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                count++;
            }
        }

        if(count == 0) {
            System.out.printf("\n Trong chuỗi '%s' không có ký tự này",str);
        } else {
            System.out.printf("\n Trong chuỗi '%s' có ký tự %c xuất hiện %d lần",str,c,count);
        }
    }
}