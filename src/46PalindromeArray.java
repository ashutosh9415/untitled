class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Array Program\n");
        int[] numArr = ArrayUtility.inputArray();

        boolean rev = reversArray(numArr);
        if (rev){
            System.out.println("Your Array is Palindrome");
        }else {
            System.out.println("Your Array is not Palindrome");
        }

    }
    public static boolean reversArray(int[] Arr){
        int i = 0;
        while (i < Arr.length/2 ){
            if (Arr[i] != Arr[(Arr.length - 1) - i]){
                return false;
            }
            i++;
        }
        return true;
    }
}