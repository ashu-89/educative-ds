class CheckMergeArray {
    // merge arr1 and arr2 into a new result array
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        // write your code here

        int[] sortedMergedArray = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length && k < sortedMergedArray.length) {


            if (arr1[i] < arr2[j]) {
                sortedMergedArray[k] = arr1[i];
                i++;
            } else {
                sortedMergedArray[k] = arr2[j];
                j++;
            }
            k++;


        }

        if (i == arr1.length) {
            if (j == arr2.length) {
                //do nothing
            } else if (j < arr2.length) {

                while (j < arr2.length) {
                    sortedMergedArray[k] = arr2[j];
                    k++;
                    j++;
                }

            }
        } else {
            while (i < arr1.length) {
                sortedMergedArray[k] = arr1[i];
                k++;
                i++;
            }
        }

        return sortedMergedArray; // make a new resultant array and return your results in that
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 6, 7,};

        int[] mergedArray = mergeArrays(arr1, arr2);

        for (int i = 0; i < mergedArray.length; i++) {
            System.out.println(mergedArray[i]);
        }

    }
}