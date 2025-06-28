import java.util.Scanner;

class AgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age in years: ");
        int age = input.nextInt();

        if (age >= 60) {
            System.out.println("You are a Senior person.");
        } else if (age >= 20) {
            System.out.println("You are an Adult person.");
        } else if (age >= 13) {
            System.out.println("You are a Teen person.");
        } else {
            System.out.println("You are a Child.");
        }
    }
}