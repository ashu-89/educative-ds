import java.util.Arrays;

class Main {

    public static int[] removeEven(int[] arr) {

        //Algo
        //keep reading array from left to right
        //we'll keep creating new arrays with increasing size and keep putting the new odd numbers in it,
        //we'll keep storing values of newer arrarys to same reference pointer - diff from arr

        //finally, we'll store reference of final array pointed to by ref pointer in arr
        int[] pointer = new int[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                pointer = increaseSizeOfArrayAndInsert(pointer, arr[i]);
            }
        }
        arr = pointer;
        return arr; // change this and return the correct result array
    }

    private static int[] increaseSizeOfArrayAndInsert(int[] pointerArr, int oddNumberToAdd) {

        int i;
        int[] newArray = new int[pointerArr.length + 1];
        for (i = 0; i < pointerArr.length; i++) {
            newArray[i] = pointerArr[i];
        }
        newArray[i] = oddNumberToAdd;
        pointerArr = newArray;
        return pointerArr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] removedEvens = removeEven(arr);

        for (int i = 0; i < removedEvens.length; i++) {
            System.out.print(removedEvens[i] + " ");
        }
    }

}