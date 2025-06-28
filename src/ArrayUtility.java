import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter the length of array: ");
        int lengthArray = input.nextInt();
        int[] nums = new int[lengthArray];
        int i =0;
        while (i < lengthArray){
            System.out.print("Enter the element of arrays "+(i+1)+":");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;


    }public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter the number of rows in array: ");
        int rows = input.nextInt();
        System.out.print("Please, Enter the number of columns in array: ");
        int columns = input.nextInt();
        int[][] numArray = new int[rows][columns];
        int i =0;
        while (i < rows){
            int j = 0;
            while (j < columns){
                System.out.print("Enter the element of rows :"+(i+1)+", columns :"+(j+1)+" :");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }



    public static void displayArray(int[] numArray){
        int i = 0;
        while (i < numArray.length){
            System.out.print(numArray[i]+ " ");
            i++;
        }
        System.out.println();
    }
}
