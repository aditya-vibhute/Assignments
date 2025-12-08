public class ArmStrongNum {
    public boolean armStrongNumCheck(int n){
        String s=Integer.toString(n);
        int power=s.length();

        int result=0;
        for(int i=0; i<power; i++){
            int digit=s.charAt(i)-'0';
            result+=(int)Math.pow(digit, power);
        }

        return n==result;
    }
}
