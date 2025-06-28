import java.util.Scanner;

class MaxMinArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Max and Min Array\n");
        int[] numArray = ArrayUtility.inputArray();
        int max = Max(numArray);
        int min = Min(numArray);
        System.out.println("Max of is array is :" + max);
        System.out.println("Min of is array is :" + min);
    }
//    public static int Max(int[] numArray){
//        int i=1;
//        int max = numArray[0];
//        while (i<numArray.length){
//            if (max < numArray[i]){
//                max = numArray[i];
//            }
//            i++;
//        }
//        return max;
//    }
//    public static int Min(int[] numArray){
//        int i=1;
//        int min = numArray[0];
//        while (i<numArray.length){
//            if (min > numArray[i]){
//                min = numArray[i];
//            }
//            i++;
//        }
//        return min;
//    }

    //  "Other method of Min or Max"
    public static int Max(int[] numArray){
        int max = Integer.MIN_VALUE;
        int i=0;
        while (i<numArray.length){
            if (max < numArray[i]){
                max = numArray[i];
            }
            i++;
        }
        return max;
    }
    public static int Min(int[] numArray){
        int min = Integer.MAX_VALUE;
        int i=0;
        while (i<numArray.length){
            if (min > numArray[i]){
                min = numArray[i];
            }
            i++;
        }
        return min;
    }
}