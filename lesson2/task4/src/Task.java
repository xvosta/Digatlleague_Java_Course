public class Task {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sum(matrix));
    }

    public static int sum(int[][] matrix) {
        int sum=0;
        for (int i =0;i<matrix.length;i++)
            sum +=matrix[i][i];
        return sum;
    }
}