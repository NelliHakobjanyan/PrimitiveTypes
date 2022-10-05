public class Matrix {

    public static void matrixMultiplication() {


        int matrix1[][] = {{0, 1}, {2, 3}};

        int matrix2[][] = {{10, 11}, {12, 13}};

        int matrixResult[][] = new int[2][2];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                for (int k = 0; k < 2; k++) {
                    matrixResult[i][j] += matrix1[i][k] * matrix2[k][j];

                }
                System.out.print(matrixResult[i][j] + " ");
            }
            System.out.println();
        }
    }

}

  class m{
    public static void main(String[] args) {
        new Matrix().matrixMultiplication();
    }
}
