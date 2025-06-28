import java.util.Scanner;

class returnNewArrayDeletingElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to return new array after deleting elements\n");
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Please, Enter the element which want to Delete.");
        int delete = input.nextInt();
        int[] newArray = deleteNumber(numArray,delete);
        System.out.print("Here is new array: ");
        ArrayUtility.displayArray(newArray);

    }
    public static int[] deleteNumber(int[] numArray,int delete){
        int occ = ArrayOccurrences.noOfOccurrences(numArray,delete);
        if (occ == 0){
            return  numArray;
        }
        int newSize = numArray.length - occ;
        int[] newArray = new int[newSize];

        int i = 0 ,j = 0;
        while (i < numArray.length){
            if (numArray[i] != delete){
                newArray[j] = numArray[i];
                j++;
            }
            i++;
        }
        return newArray;
    }
}