import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your First Number :");
        int first = input.nextInt();
        System.out.print("Enter your Second number :");
        int second = input.nextInt();
        int sum = first + second;
        System.out.println("Sum of two number :" + sum);

    }
}
