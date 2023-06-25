class ProductArray
{
    public static int[] findProduct(int arr[])
    {
        int [] result = new int[arr.length];

        //in the first traversal, at each index i, we'll store in result of i, product of all nos to the left of i
        int temp = 1;
        for(int i = 0; i<arr.length; i++){
            result[i]=temp;
            temp *= arr[i];
        }

        //in the second traversal, store product of all nos to the right
        temp = 1;
        for(int i = arr.length-1; i >= 0; i--){
            result[i] *= temp;
            temp *= arr[i];

        }


        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int[] result = findProduct(arr);

        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}