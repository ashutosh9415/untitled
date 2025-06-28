class SortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to sorted array\n");
        int[] numArray = ArrayUtility.inputArray();
        boolean inc = increasing(numArray);
        boolean dec = decreasing(numArray);
        if (inc || dec){
            System.out.println("Your array is sorted");
        }else {
            System.out.println("Your array is not sorted");
        }

    }
    public static boolean increasing(int[] numArray){
        int i = 1;
        while (i < numArray.length){
            if (numArray[i] < numArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean decreasing(int[] numArray){
        int i = 1;
        while (i < numArray.length){
            if (numArray[i] > numArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

}