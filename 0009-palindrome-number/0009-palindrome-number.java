class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        for(int i=0;i<=(str.length()/2);i++){
            int j=str.length()-i-1;
            if(i==j){return true;}
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}