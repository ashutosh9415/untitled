import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Base of triangle in cm: ");
        double Base = input.nextDouble();
        System.out.print("Enter the Height of triangle in cm: ");
        double Height = input.nextDouble();

        //double Area = 0.5*Base*Height;
        double Area = (Base*Height)/2;
        System.out.println("Area of Triangle: "+ Area+"cm2");
    }
}
