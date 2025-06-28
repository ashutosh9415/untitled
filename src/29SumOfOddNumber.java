import java.util.Scanner;

class SumOfOddNumber {
    public static void main(String[] args) {
        geet();
        sumOfOdd();

    }
    public static int sumOfOdd(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your number: ");
        int num = input.nextInt();
        int sum = 0;
        int i = 1;
        while (i<=num){
            sum = sum + i;
            i=i+2;
        }
        System.out.println("Sum of your odd number is "+sum);
        return 0;
    }
    public static void geet(){
        System.out.println("Welcome to sum of odd numbers.\n");
    }

}