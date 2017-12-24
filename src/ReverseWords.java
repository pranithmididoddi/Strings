import java.util.Arrays;

public class ReverseWords {

    public static String reverseWords(String s) {

        if(s.trim().length()==0) return "";

        String[] myarray=s.split(" ");

        int i=0, j=myarray.length-1;

        while(i<j){
            String temp=myarray[i];
            myarray[i]=myarray[j];
            myarray[j]=temp;

            i++;
            j--;
        }
        StringBuffer sb=new StringBuffer();

        for(String string: myarray){
            sb.append(string+" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {

        char[] characterarray={'a','a'};
        int count=1;

        for(int i=1;i<characterarray.length;i++){
            if(characterarray[i-1]==characterarray[i]){
                count++;

                char c=characterarray[i];
                characterarray[i]=(char) count;
            }
        }
        System.out.println(new String(characterarray));

    }
}
