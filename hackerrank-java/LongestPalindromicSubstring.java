public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        
    }

    public String longestString() {
        String max="", curr;
        for( int i=0;i<s.length();i++){
                curr=find(s,i,i);
            if(curr.length()>max.length())
                max=curr;
                curr=find(s,i,i+1);
            if(curr.length()>max.length())
                max=curr;
          
          
            
            
        }
        return max;
    }

    String find(String s , int low , int high){
    int n=s.length();
    while(low>=0 && high <n && (s.charAt(low))==(s.charAt(high)))
    {
    low--;
    high++;
    }
    return s.substring(low+1, high);

}
}