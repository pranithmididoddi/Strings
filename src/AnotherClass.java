public class AnotherClass {

    public static void main(String[] args){
        System.out.println(new AnotherClass().AtoI("2147483648"));
        System.out.println(countBinarySubstrings("001110011"));
    }

    public int AtoI(String string){
        if(string.length()==0 || string==null){
            return 0;
        }

        string=string.trim();

        int count=0;
        double sum=0;
        int i=0;
        boolean negativeflag=false;

        if(string.charAt(i)=='-'){
            negativeflag=true;
            i++;
        }else if(string.charAt(i)=='+'){
            i++;
        }


        while(i<string.length() && string.charAt(i)>='0' && string.charAt(i)<='9'){
            sum=sum*10+(string.charAt(i)-'0');
            i++;
        }

        if(negativeflag){
            sum=-sum;
        }

        if(sum>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(sum<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int) sum;
    }




    public static int countBinarySubstrings(String string){

        int result=0;
        int count=1;
        int revcount=0;

        for(int i=1;i<string.length();i++){
            if(string.charAt(i)==string.charAt(i-1)){
                count++;
            }else{
                revcount=count;
                count=1;
            }

            if(revcount>=count) {
                result++;
            }
        }
    return result;
    }
}
