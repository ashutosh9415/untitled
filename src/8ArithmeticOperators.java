import java.util.Scanner;

class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Enter the second number: ");
        int second = input.nextInt();
        int sum = first + second;
        System.out.println("Sum of two number :" + sum);
        int sub = first - second;
        System.out.println("Sub of two number :" + sub);
        int mul = first * second;
        System.out.println("Multiplication of two number :" + mul);
        int div = first / second;
        System.out.println("Division of two number :" + div);
        int mod = first % second;
        System.out.println("Modulus of two number :" + mod);
    }
}