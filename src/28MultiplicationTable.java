import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        geet();
        multiplication();

    }

    public static int multiplication(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your multiplication number: ");
        int num = input.nextInt();
        int i = 1;
        while(i <= 10){
            int result = num * i;
            System.out.println(num + " X " + i +" = "+result);
            i = i+1;
        }
        return 0;
    }
    public static void geet(){
        System.out.println("Welcome to Multiplication Table.\n");
    }
}