class Solution {
    public String[] findWords(String[] words) {
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        Stack<String> result = new Stack<String>(); 
        int pushIndex = 0;
        for(int i = 0; i < words.length; i++){
            String thisString;
            Boolean notMatch = false;
            if(first.indexOf(Character.toLowerCase(words[i].charAt(0))) != -1)
                thisString = first;
            else if(second.indexOf(Character.toLowerCase(words[i].charAt(0))) != -1)
                thisString = second;
            else
                thisString = third;
            for(int j = 1; j < words[i].length(); j++){
                if(thisString.indexOf(Character.toLowerCase(words[i].charAt(j))) == -1)
                    notMatch = true;
            }
            if(!notMatch){
                result.push(words[i]);
                pushIndex++;
            }
        }
        String[] res = result.toArray(new String[pushIndex]);
        return res;
    }
}
