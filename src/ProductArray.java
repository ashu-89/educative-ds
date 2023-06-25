class ProductArray
{
    public static int[] findProduct(int arr[])
    {
        int [] result = new int[arr.length];

        for(int i = 0; i < arr.length; i++){

            result[i] = 1;

            for(int j = 0; j < arr.length; j++){

                if(i==j){

                }
                else{
                    result[i] *= arr[j];
                }

            }
        }


        // write your code here

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