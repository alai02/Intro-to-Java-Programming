   public static void multiplyingTwoMaricies() {
        System.out.println("input the rows and columns for the first matrix");
        int[][] matrix1 = generateMatrix();
        System.out.println("input the rows and columns for the second matrix");
        int[][] matrix2 = generateMatrix();
        int[][] matrix3 = new int[matrix1.length][matrix2.length];
        int sum = 0;
        if (matrix1[0].length == matrix2.length) {
            for (int row = 0; row < matrix3.length; row++) {
                for (int col = 0; col < matrix3[0].length; col++) {
                    sum = 0;
                    for (int m = 0; m < matrix1[0].length; m++) {
                        sum += matrix1[row][m] * matrix2[col][m];
                    }
                    matrix3[row][col] = sum;
                }
            }
        }
    }
}