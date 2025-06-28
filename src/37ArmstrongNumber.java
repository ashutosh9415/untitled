import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Armstrong Program.\n");
        System.out.print("Please Enter the number: ");
        int number = input.nextInt();
        boolean isArmstrong = isArmstrong(number);
        if (isArmstrong){
            System.out.println("Your number is Armstrong.");
        }else {
            System.out.println("Your number is not Armstrong.");
        }
    }

    public static boolean isArmstrong(int number){
        int noOfDigits = noOfDigit(number);
        int numberCopy = number;
        int finalNumber = 0;
        while (number > 0){
            int lastDigit = number % 10;
            number /= 10;
            finalNumber += pow(lastDigit, noOfDigits);
        }
        return finalNumber == numberCopy;
    }
    public  static  int pow( int number1, int number2){
        int result = 1;
        int i = 0;
        while (i < number2){
            result *= number1;
            i++;
        }
        return result;
    }
    public static int noOfDigit(int number){
        int digits = 0;
        while (number > 0){
            digits++;
            number /= 10;
        }
        return digits;
    }
}