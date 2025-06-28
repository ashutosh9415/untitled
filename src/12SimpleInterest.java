import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the your Principle Amount in Rs: ");
        int principle = input.nextInt();
        System.out.print("Enter the your rate of many: ");
        Double rate = input.nextDouble();
        System.out.print("Enter the your time in year: ");
        int time = input.nextInt();

        Double simpleInterest = (principle*rate*time)/100;
        System.out.println("Your Simple Interest is: "+ simpleInterest+"Rs" );
    }
}
