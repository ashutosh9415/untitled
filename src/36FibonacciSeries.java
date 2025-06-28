import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series Program.\n");
        System.out.print("Please Enter number of terms: ");
        int number = input.nextInt();
        Fibonacci(number);
        System.out.print("your series is ");

    }
    public static void Fibonacci(int number){
        if(number < 0) return;
        System.out.print("0 ");
        if (number == 0) return;
        System.out.print("1 ");
        int first = 0;
        int second = 1;
        while (first + second <= number){
            int fibonacci = first+second;
            System.out.print(fibonacci + " ");
            first = second;
            second = fibonacci;
        }
    }
}