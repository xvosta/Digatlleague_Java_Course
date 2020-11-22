public class Task {
    public static void main(String[] args) {
        int[][] matrix=new int[10][10];
        System.out.println(maxValue(matrix));
    }

    public static int maxValue(int[][] matrix) {
        int max = matrix[0][0];
        for (int i =0;i<matrix.length;i++)
            for (int j=0;j<matrix[i].length;j++)
                if (max<matrix[i][j])
                    max = matrix[i][j];
        return max;
    }
}