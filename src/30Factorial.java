import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        geet();
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial is "+ fact);
    }

    public static long factorial(int num){
        if (num == 0 || num == 1){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num){
            fact = fact*i;
            i++;
        }
        return fact;
    }

    public static void geet(){
        System.out.println("Welcome to Factorial Calculation.\n");
    }
}