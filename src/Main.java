public class Main {


    public static void main(String[] args) {

       Main main=new Main();

        //System.out.println(main.reverse("abcdefg",2));

        System.out.println(main.isSubString("abbabbabba"));

        System.out.println(main.romanToDecimal("MDXCIX"));


        String s=""+'c'+2;
        System.out.println(s);
      }

      public String reverse(String s,int k){

        int i=0;
        char[] array=s.toCharArray();
        int n=s.length();

        while(i<n){
            int j=Math.min(k+i-1,n-1);
            reverse(array,i,j);
            i+=2*k;
        }
       return String.valueOf(array);
      }

      public void reverse(char[] array,int i,int j){

          while(i<j){
              char temp=array[i];
              array[i]=array[j];
              array[j]=temp;

              i++;
              j--;
          }
      }

//abbabbabb
      public boolean isSubString(String s){
          int length=s.length();

          for(int i=length/2;i>=1;i--){
              if(length%i==0){
                  String sub=s.substring(0,i);
                  int m=length/i;
                  StringBuilder sb=new StringBuilder();

                  for(int j=0;j<m;j++){
                      sb.append(sub);
                  }

                 if(sb.toString().equals(s)) return true;

              }
          }
          return false;
      }

    int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    int romanToDecimal(String str)
    {
        // Initialize result
        int res = 0;

        for (int i=0; i<str.length(); i++)
        {
            // Getting value of symbol s[i]
            int s1 = value(str.charAt(i));

            // Getting value of symbol s[i+1]
            if (i+1 <str.length())
            {
                int s2 = value(str.charAt(i+1));

                // Comparing both values
                if (s1 >= s2)
                {
                    // Value of current symbol is greater
                    // or equalto the next symbol
                    res = res + s1;
                }
                else
                {
                    res = res + s2 - s1;
                    i++; // Value of current symbol is
                    // less than the next symbol
                }
            }
            else
            {
                res = res + s1;
                i++;
            }
        }

        return res;
    }



}



