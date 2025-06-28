import java.util.Scanner;

class GratingMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the your marks in %: ");
        int mark = input.nextInt();
        if (mark >= 90){
            System.out.println("You got the A grade.");
        }else if (mark >= 75) {
            System.out.println("You got the B grade.");
        }else if (mark >= 60) {
            System.out.println("You got the C grade.");
        }else if (mark >= 30) {
            System.out.println("You got the D grade.");
        }else{
            System.out.println("You are failed.");
        }
    }
}