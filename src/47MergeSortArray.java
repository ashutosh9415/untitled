class MergeSortArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Merging sorted Array\n");
        int[] Arr1 = ArrayUtility.inputArray();
        int[] Arr2 = ArrayUtility.inputArray();
        int[] NewArr = MergeArr(Arr1,Arr2);
        System.out.println("After sorting Array is :");
        ArrayUtility.displayArray(NewArr);

    }
    public static int[] MergeArr(int[] Arr1, int[] Arr2){
        int NewSize = Arr1.length +Arr2.length;
        int[] newArray = new int[NewSize];
        int i = 0,j = 0,k =0;
        while (i < Arr1.length || j < Arr2.length){
            if (j == Arr2.length ||(i < Arr1.length && Arr1[i] <Arr2[j])){
                newArray[k]=Arr1[i];
                i++;
                k++;
            }else {
                newArray[k]=Arr2[j];
                j++;
                k++;
            }
        }
        return newArray;
    }
}