import java.util.Scanner;

class LeastCommonMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM Calculator.\n");
        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter second number: ");
        int num2 = input.nextInt();
        int lcm = LCM(num1, num2);
        System.out.println("LCM of your number is "+lcm);
    }

    public static int LCM(int num1, int num2){
        int i = 1;
        while (true){
            int fact = num1 * i;
            if (fact % num2  == 0){
                return fact;
            }
            i+=1;
        }
    }

}