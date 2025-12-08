public class Bubble {
    public void sort(int[] arr){
        int len=arr.length;

        for(int i=len-1;i>0; i--){
            for(int j=0; j<i; j++){

                if(arr[j]>arr[j+1]){
                    swap(j,j+1, arr);
                }
            }
        }
    }

    public void swap(int i, int j, int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
