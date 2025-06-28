
import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse number Program.\n");
        System.out.print("Please Enter your number: ");
        int number = input.nextInt();
        int revers = Reverse(number);
        System.out.println("Reverse number is "+revers);
    }

    public static int Reverse(int number){
        int reverse = 0;
        while (number != 0){
            int digit = number%10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }
}