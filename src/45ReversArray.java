import java.util.Scanner;

class ReversArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Revers Array Program\n");
        int[] numArr = ArrayUtility.inputArray();
        reversArray(numArr);
        System.out.print("After revers array is ");
        ArrayUtility.displayArray(numArr);

    }
    public static void reversArray(int[] Arr){
        int i = 0;
        while (i < Arr.length/2 ){
            int swap = Arr[i];
            Arr[i] = Arr[(Arr.length - 1) - i];
            Arr[(Arr.length - 1) - i] = swap;
            i++;
        }
    }
}