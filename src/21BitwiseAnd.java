import java.util.Scanner;

class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Showcasing Bitwise AND Operator.");
        System.out.print("Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Enter the second number: ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("Your result is: "+result);
    }
}