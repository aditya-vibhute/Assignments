package coding_probs;
public class NthFact {
    public int calcFact(int n){
        if(n<2) return 1;

        int[] facts=new int[n+1];
        facts[0]=1;
        facts[1]=1;

        for(int i=2; i<=n; i++){
            facts[i]=i*facts[i-1];
        }

        return facts[n];
    } 
}
