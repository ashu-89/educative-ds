class CheckFirstUnique
{
    public static int findFirstUnique(int[] arr)
    {
        int result = 0;


        // write your code here
        for(int i=0; i<arr.length; i++){

            int isDuplicate = 0;

            for(int j=0; j<arr.length; j++){

                if(j==i)
                    continue;

                if(arr[j] == arr[i]){
                    isDuplicate = 1;
                    break;
                }
            }
            if(isDuplicate == 0){
                return arr[i];
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {4,5,1,2,0,4};

        int x = findFirstUnique(arr);
        System.out.println(x);
    }


}