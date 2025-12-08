import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Q-1
        CheckPrime checkPrime=new CheckPrime();
        boolean res= checkPrime.isPrime(10);
        System.out.println(res);

        //Q-2
        StringReverse stringReverse=new StringReverse();
        String res2=stringReverse.reveString("ABC");
        System.out.println(res2);

        //Q-3
        ArraySmallest arraySmallest=new ArraySmallest();
        int smallest=arraySmallest.smallestEle(new int[]{1,2,3,5,6,7,8});
        System.out.println(smallest);

        //Q-4
        FibonacciN fibonacciN=new FibonacciN();
        int n=fibonacciN.NthFibo(5);
        System.out.println(n);

        //Q-5
        BinarySearch binarySearch=new BinarySearch();
        int index= binarySearch.serch(1, new int[]{1,3,5,7,8});
        System.out.println(index);

        //Q-6
        Bubble bubble=new Bubble();
        int[] arr=new int[]{9,8,3,4,5,2,1,3};
        bubble.sort(arr);
        for(int i:arr){
            System.out.print(i+" ,");
        }
        System.out.println();

        //Q-7
        NthFact nthFact=new NthFact();
        int fact=nthFact.calcFact(5);
        System.out.println(fact);

        //Q-8
        VowelCounter vowelCounter=new VowelCounter();
        int count=vowelCounter.countVowels(new String("Aeiousfgtryeu"));
        System.out.println(count);

        //Q-9
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int N = sc.nextInt();  

        for (int i = 1; i <= N; i++) {      
            for (int j = 1; j <= i; j++) {  
                System.out.print("*");
            }
            System.out.println();        
        }

        //Q-10
        ArmStrongNum armStrongNum=new ArmStrongNum();
        System.out.println(armStrongNum.armStrongNumCheck(371));
    }
}
