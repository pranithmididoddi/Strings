import java.util.Properties;

public class Fibonacci {


    public static int[] memo=new int[26];

    public static void main(String[] args){

        System.out.println();
        System.out.println(fibo(3));
        System.out.println(System.currentTimeMillis());

    }

    public static int fibo(int n){

        if(n==0 || n==1){
            memo[n]=1;
        }else if(memo[n]!=0) {
            return memo[n];
        }else {
            memo[n] = fibo(n - 1) + fibo(n - 2);
        }


        return memo[n];
    }
}
