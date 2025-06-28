import java.util.Scanner;

class GreatestCommonDivisor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GCD Calculator.");
        System.out.print("Please Enter your first number.");
        int first = input.nextInt();
        System.out.print("Please enter your second number.");
        int second = input.nextInt();
        int gcd = GCD(first,second);
        System.out.println("GCD of your numbers is "+gcd);
    }

    public static int GCD(int first, int second){
        int gcd = 1;
        int i = 2;
        int least = least(first ,second);
        while (i <= least){
            if (first % i == 0 && second %i ==0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int first ,int second){
        if (first < second){
            return first;
        }else {
            return second;
        }
    }
}