import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Temperature in Fahrenheit: ");
        Double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Temperature in Celsius is: "+celsius);
    }
}
