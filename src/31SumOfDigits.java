import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        geet();
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your number: ");
        int num =input.nextInt();
        long sum = DigitSum(num);
        System.out.println("Sum of the your Digit is "+ sum);
    }

    public static long DigitSum(int num){
        int sum = 0;
        while (num > 0){
            sum = sum + (num%10);
            num = num/10;
        }
        return sum;
    }

    public static void geet(){
        System.out.println("Welcome to sum of your Digit.\n");
    }
}