import java.util.*;

public class program4 {
    int row;
    int column;
    int[][] array = new int[10][10];

    public void get_metrix() {
        int r, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows of matrix: ");
        this.row = sc.nextInt();
        System.out.print("Enter no of colomns of matrix: ");
        this.column = sc.nextInt();
        System.out.print("Enter matrix elements : ");
        for (r = 0; r < this.row; r++) {
            for (c = 0; c < this.column; c++) {
                this.array[r][c] = sc.nextInt();
            }
        }
    }

    public void is_symmetric() {
        int r, c, flag = 0;
        int[][] transpose = new int[10][10];

        for (r = 0; r < this.row; r++) {
            for (c = 0; c < this.column; c++) {
                transpose[c][r] = array[r][c];
            }
        }

        for (r = 0; r < this.row; r++) {
            for (c= 0; c < this.column; c++) {
                if (this.array[r][c] != transpose[r][c]) {
                    flag = 1;
                }
            }
        }
        if (flag == 0) {
            System.out.println("symmetric");
        } else {
            System.out.println("not symmetric");
        }

    }

    public static void main(String[] args) {
        program4 first = new program4();
        first.get_metrix();
        first.is_symmetric();
        System.out.println("......END.......");
    }
}
