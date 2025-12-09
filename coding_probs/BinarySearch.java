package coding_probs;
public class BinarySearch {
    public int serch(int element, int[] arr){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            int midElement=arr[mid];
            if(midElement==element){
                return mid;
            }

            if(midElement<element) low=mid+1;
            if(midElement>element) high=mid-1;
            
        }
        return -1;
    }
}
