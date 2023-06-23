class CheckSum
{
    public static int[] findSum(int[] arr, int n)
    {
        int[] result = new int[2];

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == n){
                    result[0] = arr[i];
                    result[1] = arr[j];
                    return  result;
                }
            }
        }

        result = arr;

        // write your code here
        return result;   // return the elements in the array whose sum is equal to the value passed as parameter
    }

    public static void main(String[] args) {


        int arr[] = {5,6,7,8,9,10};
        int n = 20;

        int[] result = findSum(arr,n);

        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}