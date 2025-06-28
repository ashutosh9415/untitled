import java.util.Scanner;

class PattersPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Pattern Printing.\n");
        System.out.print("Please Enter your rows: ");
        int rows = input.nextInt();
        System.out.println("Your Right Half Pyramid is: ");
        RightHalfPyramid(rows);
        System.out.println("Your Reverse Right Half Pyramid is: ");
        ReverseRightHalfPyramid(rows);
        System.out.println("Your Left Half Pyramid is: ");
        LeftHalfPyramid(rows);

    }
    public static void RightHalfPyramid(int row){
        int i = 0;
        while (i < row){
            System.out.print("*");
            int j = 0;
            while (j < i){
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void ReverseRightHalfPyramid(int row){
        int i = row;
        while (i >= 1){
            System.out.print("*");
            int j = i;
            while (j > 1){
                System.out.print(" *");
                j--;
            }
            System.out.println();
            i--;
        }
    }
    public static void LeftHalfPyramid(int row) {
        int i = row;
        while (i > 0) {
            int k = 0;
            while (k < i - 1) {
                System.out.print("  "); // two spaces for alignment
                k++;
            }
            int j = 0;
            while (j <= (row - i)) {
                System.out.print("* "); // star with space
                j++;
            }
            System.out.println();
            i--;
        }
    }
}