class SumAndAvg2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum and average 2D array. \n");
        int[][] numArray = ArrayUtility.input2DArray();
        long ArraySum = Sum(numArray);
        System.out.println("Sum of 2D array is :" +ArraySum );
        double AvgOfArray = Avg(numArray);
        System.out.println("Average of 2D array is :" +AvgOfArray);

    }
    public static long Sum(int[][] numArray){
        int sum = 0;
        int i=0;
        while (i < numArray.length){
            int j = 0;
            while (j < numArray[i].length){
                sum = sum + numArray[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double Avg(int[][] numArray){
        int row = numArray.length;
        int clo = numArray[0].length;
        double size = row*clo;
        return Sum(numArray)/size;
    }
}