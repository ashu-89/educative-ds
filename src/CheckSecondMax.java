import javax.management.InstanceNotFoundException;

class CheckSecondMax {

    public int findSecondMaximum(int[] arr)
    {
        int max = arr[0];
        int secondMax;
        int temp;

        if(arr[1] < arr[0]){
            secondMax = arr[1];
        } else {
            max = arr[1];
            secondMax = arr[0];
        }

        for(int i=2; i<arr.length-1; i++){
            if(arr[i] > max) {
                temp = max;
                max = arr[i];
                secondMax = temp;
            } else if( arr[i] > secondMax && arr[i] < max){
                secondMax = arr[i];
            }

            if(arr[i+1] > max){
                temp = max;
                max = arr[i+1];
                secondMax = temp;
            } else if(arr[i+1] > secondMax && arr[i+1] < max){
                secondMax = arr[i+1];
            }
        }

        return secondMax;

    }

    public static void main(String[] args) {
        int[] arr = {1,5,3,9,6};

        CheckSecondMax checkSecondMax = new CheckSecondMax();

        int secondMax = checkSecondMax.findSecondMaximum(arr);

        System.out.println(secondMax);
    }
}