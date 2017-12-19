public class LeetCodeSolutions {
    public boolean detectCapitalUse(String word) {
        if(word.toLowerCase().equals(word)) return true;
        if(word.toUpperCase().equals(word)) return true;
        if(word.substring(1).toLowerCase().equals(word.substring(1))) return true;
        return false;
    }


}
