import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your principle Amount in Rs: ");
        int principle = input.nextInt();
        System.out.print("Enter your Rate of Amount: ");
        Double rate = input.nextDouble();
        System.out.print("Enter your Time of Amount: ");
        int time = input.nextInt();

        Double interest = principle * Math.pow((1+rate/100),time);
        System.out.println("Your Amount interest is: "+interest+"Rs");
    }
}