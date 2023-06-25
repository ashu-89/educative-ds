class CheckSum
{
   static int count = 0;

    public static int[] findSum(int[] arr, int n)
    {
        int[] result = new int[2];

        int left_ptr = 0;
        int right_ptr = arr.length -1;

        while(left_ptr != right_ptr){
            if(arr[left_ptr] + arr[right_ptr] == n){
                result[0] = arr[left_ptr];
                result[1] = arr[right_ptr];
                count ++;
                return result;
            }
            else if(arr[left_ptr] + arr[right_ptr] > n){
                count ++;
                right_ptr --;
            } else {
                count ++;
                left_ptr ++;
            }
        }

        result = arr;
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