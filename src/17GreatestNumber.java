import java.util.Scanner;

class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your Second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter your third number: ");
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println(num1+" is greatest number.");
        } else if (num2 >= num1 && num2 >= num3){
            System.out.println(num2+" is greatest number.");
        }else {
            System.out.println(num3+" is greatest number.");
        }
    }
}