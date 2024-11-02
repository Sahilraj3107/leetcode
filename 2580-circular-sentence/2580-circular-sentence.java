class Solution {
    public boolean isCircularSentence(String sentence) {
        
        String[] word = sentence.split(" ");

        for(int i=1;i<word.length;i++)
           if(word[i].charAt(0)!= word[i-1].charAt(word[i-1].length()-1))return false;
    
        if(word[0].charAt(0)!=word[word.length-1].charAt(word[word.length-1].length()-1))
       return false;

        return true;
    }
}