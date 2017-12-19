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

        System.out.println(isAbbreviated("",""));
        System.out.println(getDenomination(1.65));

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
}
