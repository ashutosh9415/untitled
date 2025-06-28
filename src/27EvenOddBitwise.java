import java.util.Scanner;

class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();

        if ((num & 1) == 1){
            System.out.println("Your number is Odd "+num);
        }else {
            System.out.println("your number is Even "+num);
        }
    }
}