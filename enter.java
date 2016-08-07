public class AdditionMatrix {

    int A[][];
    int B[][];
    int C[][];
    int row;
    int coloum;

    public AdditionMatrix(int n, int m) {
        this.row = n;
        this.coloum = m;
        A = new int[n][m];
        B = new int[n][m];
        C = new int[n][m];
        //assign random value for A,B
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                A[r][c] = (int) Math.round(Math.random() * 98 + 10);
                B[r][c] = (int) Math.round(Math.random() * 12);
            }
        }
    }

    public void Addition() {
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < coloum; c++) {
                C[r][c] = A[r][c] + B[r][c];
            }
        }
    }

    public void print() {
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < coloum; c++) {
                System.out.print(C[r][c] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        System.out.println("Addition of A,B :");
        AdditionMatrix S = new AdditionMatrix(4, 5);
        S.Addition();
        S.print();
        System.out.println("=======+==========+============+=========");
        System.out.println("Addition of A,B :");
        AdditionMatrix S1 = new AdditionMatrix(4, 5);
        S1.Addition();
        S1.print();
        System.out.println("=======+==========+============+=========");
    }
}