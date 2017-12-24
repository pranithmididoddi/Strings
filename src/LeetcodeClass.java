import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LeetcodeClass {


    public static String romanTointeger(int number){

        int[] values={1000,900,500,400,100,50,10,5,1};
        String[] romanValues={"M","CM","D","CD","C","L","X","V","I"};
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<values.length;i++){

            while(number>=values[i]){
                number-=values[i];
                sb.append(romanValues[i]);
            }
        }
        return sb.toString();
    }

    public static boolean isAbbreviated(String word, String abbr){
        int i=0,j=0;

        while(i<word.length() && j<abbr.length()){

            if(word.charAt(i)==abbr.charAt(j)){
                i++;
                j++;
                continue;
            }

            if(abbr.charAt(j)<='0' || abbr.charAt(j)>'9'){
                return false;
            }

            int start=j;

            while(j<abbr.length() && abbr.charAt(j)>='0' && abbr.charAt(j)<='9'){
                j++;
            }

            int num=Integer.valueOf(abbr.substring(start,j));
            i+=num;

        }

        return j==abbr.length()&&i==word.length();

    }

    public static void main(String[] args){

        /**System.out.println(isAbbreviated("",""));
        System.out.println(getDenomination(1.65));
        System.out.println(compressString("aaabbccc"));**/

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

    }


    public static String getDenomination(double currencyvalue){

        double[] denomination={1, .25, .10, .5, .1};
        String[] denominationValue={"Dollar", "Quarter", "Dime", "Nickel", "Penny"};
        StringBuilder sb=new StringBuilder();
        String s="";

        int count=0;
        for(int i=0;i<denomination.length;i++){

            while(currencyvalue>=denomination[i]){
                count++;
                currencyvalue-=denomination[i];
            }
            sb.append(" "+count+" "+denominationValue[i]);
            count=0;
        }

        return sb.toString();
    }

    public static String compressString(String value){

        char[] myarray=value.toCharArray();
        int count=1;
        char last=myarray[0];
        StringBuilder sb=new StringBuilder();

        for(int i=1;i<myarray.length;i++){
            if(myarray[i]==myarray[i-1]){
                count++;
            }else{
                sb.append(myarray[i-1]+""+count);
                count=1;
            }
            last=myarray[i];
        }
        sb.append(last+""+count);

        return sb.toString().length()>value.length()?value:sb.toString();
    }

    public static boolean isPalindrome(String s) {

        String value=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] myarray=value.toCharArray();
        int i=0,j=myarray.length-1;

        Stack<Character> stack=new Stack<>();
        System.out.println(new String(myarray));

        while(i<j) {

            if (myarray[i] != myarray[j]) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
