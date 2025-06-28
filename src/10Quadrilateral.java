import java.util.Scanner;

class Quadrilateral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side of quadrilateral: ");
        double first = input.nextDouble();
        System.out.print("Enter second side of quadrilateral: ");
        double second = input.nextDouble();
        System.out.print("Enter third side of quadrilateral: ");
        double third = input.nextDouble();
        System.out.print("Enter fourth side of quadrilateral: ");
        double fourth = input.nextDouble();


        System.out.print("Area of Quadrilateral:" + (first+second+third+fourth));
    }
}
