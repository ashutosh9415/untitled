import java.util.Scanner;

class LeftShift {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Showcasing LeftShift Operator.");
        System.out.print("Enter the your number: ");
        int num = input.nextInt();

        int result = num << 1;
        System.out.println("Your result is: "+result);
    }
}
