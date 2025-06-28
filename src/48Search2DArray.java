import java.util.Scanner;

class Search2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to searching 2D Array.\n");
        int[][] numArray = ArrayUtility.input2DArray();
        System.out.print("Please, Enter th number which is search");
        int searchNumber = input.nextInt();
        boolean isFound = Search(numArray,searchNumber);
        if (isFound){
            System.out.println("your array is found.");
        }else
            System.out.println("your array is not found.");
    }

    public static boolean Search(int[][] numArray,int searchNumber){
        int i = 0;
        while (i < numArray.length){
            int j = 0;
            while (j < numArray[i].length){
                if (numArray[i][j] == searchNumber){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}