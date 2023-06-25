class CheckSum
{
   static int count = 0;

    public static int[] findSum(int[] arr, int n)
    {
        int[] result = new int[2];

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == n){
                    result[0] = arr[i];
                    result[1] = arr[j];
                    count ++;
                    return  result;
                } else if(arr[i]+arr[j] > n){
                    count++;
                    break;
                } else {
                    count ++;
                }

            }
        }

        result = arr;

        // write your code here
        return result;   // return the elements in the array whose sum is equal to the value passed as parameter
    }

    public static void main(String[] args) {

        int arr[] = {5,6,7,9,10};
        int n = 13;


        int[] result = findSum(arr,n);

        if(result.length !=2 ){
            System.out.println("no 2 numbers add up to " + n);
        } else {
            System.out.println("the following 2 numbers add upto " + n);
        }

        System.out.println("no of steps executed " + count);

        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}