package coding_probs;
public class StringReverse {
    public String reveString(String s){
        char[] temp=s.toCharArray();
        int low=0;
        int high=temp.length-1;

        while(low<high){
            char holder=temp[low];
            temp[low]=temp[high];
            temp[high]=holder;
            
            low++;
            high--;
        }

        return new String(temp);
    }
}
