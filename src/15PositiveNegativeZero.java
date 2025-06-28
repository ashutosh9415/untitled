import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = input.nextInt();

        if (number == 0){
            System.out.println("Your number is zero "+ number);
        } else if (number > 0) {
            System.out.println("Your number is positive "+ number);
        }else {
            System.out.println("Your number is negative "+number);
        }
    }
}