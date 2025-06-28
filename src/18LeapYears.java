import java.util.Scanner;

class LeapYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the year that you want to check: ");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Your year is a leap year.");
        } else {
            System.out.println("Your year is not a leap year.");
        }
    }
}