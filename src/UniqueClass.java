public class UniqueClass {

    public static int uniqueCharacter(String string){

        int[] myarray=new int[26];

        for(int i=0;i<string.length();i++){
            myarray[string.charAt(i)-'a']++;
        }
        int count=0;

       for(int i=0;i<string.length();i++){
           if(myarray[string.charAt(i)-'a']==1){
               return i;
           }
       }
      return -1;
    }

    public static void main(String[] args){
       String string="pranith";
        int i=0;
        char[] chara=string.toCharArray();
        int j=chara.length-1;

        while(i<j){

            char temp=chara[i];
            chara[i]=chara[j];
            chara[j]=temp;

            i++;
            j--;
        }

        System.out.println(new String(chara));
    }
}
