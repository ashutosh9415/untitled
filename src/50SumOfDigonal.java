class SumOfDigonal {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum of two Digonal in 2D array.\n");
        int[][] numArray = ArrayUtility.input2DArray();
        long IsSum = DigonalSum(numArray);
        System.out.println("Sum of Digonal of array is :"+IsSum);

    }
    public static long DigonalSum(int[][] numArray){
        long leftSum = DigonalSumLeft(numArray);
        long rightSum = DigonalSumRight(numArray);
        long sum = leftSum+rightSum;
        if (numArray.length % 2 != 0){
            int ind = numArray.length/2;
            sum = sum - numArray[ind][ind];
        }
        return sum;
    }
    public static long DigonalSumLeft(int[][] numArray){
        int i = 0;
        int sum = 0;
        while (i < numArray.length){
            sum = sum + numArray[i][i];
            i++;
        }
        return sum;
    }
    public static long DigonalSumRight(int[][] numArray) {
        int i = 0;
        int sum = 0;
        while (i < numArray.length) {
            int col = (numArray.length - 1) - i;
            sum = sum + numArray[i][col];
            i++;
        }
        return sum;
    }
}