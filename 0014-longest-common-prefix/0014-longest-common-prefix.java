class Solution {
    public String longestCommonPrefix(String[] strs) {
        Integer minimumLength= 1000;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<minimumLength){
                minimumLength=strs[i].length();
            }
        }
        Character checker ='a';
        String prefix = "";
        for(int i=0;i<minimumLength;i++){
            for(int j=0;j<strs.length;j++){
                if(i==0 && j==0){
                    checker= strs[j].charAt(i);
                }
                else if(!checker.equals(strs[j].charAt(i))){
                    return prefix;
                }
            }
            prefix= prefix+checker;
            if(i!=minimumLength-1){
                checker=strs[0].charAt(i+1);
            }
            
        }
        return prefix;
    }
}