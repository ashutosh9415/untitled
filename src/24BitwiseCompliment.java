import java.util.Scanner;

class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Showcasing Bitwise Compliment Operator.");
        System.out.print("Enter the your number: ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("Your result is: "+result);
    }
}