import java.util.Scanner;

class SumAndAverageOfArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum and Average of array\n");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        double avg = Average(numArray);
        System.out.println("Sum of this array numbers is : "+sum);
        System.out.println("Average of this arrays numbers is : "+avg);
    }
    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while (i < numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;
    }
    public static double Average(int[] numArray){
        double sum = sum(numArray);
        return (sum / numArray.length);
    }
}