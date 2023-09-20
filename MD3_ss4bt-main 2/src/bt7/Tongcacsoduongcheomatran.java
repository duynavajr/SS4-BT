package bt7;

public class Tongcacsoduongcheomatran {

    public static void main(String[] args) {
        // Ma trận vuông
        int[][] matrix = {
                {4, 2, 7},
                {4, 8, 6},
                {7, 8, 9}
        };

        // Tính tổng các số ở đường chéo chính
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        // In tổng
        System.out.println("Tổng các số ở đường chéo chính: " + sum);
    }


}