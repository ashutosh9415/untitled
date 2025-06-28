import java.util.Scanner;
class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Before Swapping,\n");
        System.out.print("Enter first number :" );
        int first = input.nextInt();
        System.out.print("Enter second Number :");
        int second = input.nextInt();
        int swap;
        swap = first;
        first = second;
        second = swap;
        System.out.println("After swapping,\n");
        System.out.println("first number is :"+ first);
        System.out.println("Second number is :"+ second);
    }
}