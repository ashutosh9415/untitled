import java.util.Scanner;

class ArrayOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Occurrences\n");
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Now, Enter the number to find :");
        int find = input.nextInt();
        int occurrences = noOfOccurrences(numArray,find);
        System.out.print("Occurrences in Arrays is : "+occurrences);
    }
    public static int noOfOccurrences(int[] numArray, int find){
        int count = 0;
        int i = 0;
        while(i < numArray.length){
            if (numArray[i] == find){
                count+=1;
            }
            i++;
        }
        return count;
    }
}