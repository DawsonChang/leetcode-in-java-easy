class Solution {
    public boolean detectCapitalUse(String word) {
        boolean res = true;
        if(word.charAt(0) >= 97 && word.charAt(0) <= 122){
            for(int i = 1; i < word.length(); i++){
                if(word.charAt(i) >= 97 && word.charAt(i) <= 122){
                    continue;
                }
                else{
                    res = false;
                }
            }
        }
        else{
            int lower = 0, upper = 0;
            for(int i = 1; i < word.length(); i++){
                if(word.charAt(i) >= 97 && word.charAt(i) <= 122){
                    lower++;   
                }
                else{
                    upper++;
                }
            }
            if(lower > 0 && lower != word.length()-1){
                res = false;
            }
            if(upper > 0 && upper != word.length()-1){
                res = false;
            }
        }

        return res;
    }
}
