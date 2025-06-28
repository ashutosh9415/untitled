import java.util.Scanner;

class FloatingMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double first = input.nextDouble();
        System.out.print("Enter the second number: ");
        double second = input.nextDouble();

        double mul = first *second;
        System.out.println("Sum of two number :" + mul);
    }
}
