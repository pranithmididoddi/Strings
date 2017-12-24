public class StringAddition {

    public static void main(String[] args){

        char c='L';

        System.out.println(c-'L');

       // System.out.println(binaryAddition("1","111"));
    }

    public static String binaryAddition(String a, String b){
        int lengtha=a.length()-1;
        int lengthb=b.length()-1;

        int carry=0;
        StringBuffer sb=new StringBuffer();

        while(lengtha>=0 || lengthb>=0){
            int sum=carry;

            int valuea=0;
            int valueb=0;

            if(lengtha>=0){
                valuea=a.charAt(lengtha)=='0'?0:1;
                lengtha--;
            }

            if(lengthb>=0){
                valueb=b.charAt(lengthb)=='0'?0:1;
                lengthb--;
            }

            sum=sum+valuea+valueb;

            if(sum>=2){
                sb.append(String.valueOf(sum-2));
                carry=1;
            }else{
                carry=0;
                sb.append(sum);
            }
        }

        if(carry==1){
            sb.append("1");
        }

       return sb.reverse().toString();
    }
}
