import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = input.nextInt();

        if(number%2==0){
            System.out.println("Your number is Even "+number);
        }else {
            System.out.println("your number is odd "+number);
        }
    }
}