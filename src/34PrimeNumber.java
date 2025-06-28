import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime number Calculator.\n ");
        System.out.print("Please Enter your number: ");
        int number = input.nextInt();
        boolean prime = Prime(number);
        if (prime){
            System.out.println("Your number is Prime.");
        }else{
            System.out.println("Your number is not Prime.");
        }
    }

    public static boolean Prime(int number){
        int i = 2;
        while (i < number){
            if (number % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}