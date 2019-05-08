class Solution {
    public String convertToBase7(int num) {
        String result = "";
        Boolean isNag = false;
        if(num < 0){
            num = Math.abs(num);
            isNag = true;
        }
        while(num >= 7){
            result = Integer.toString(num % 7) + result;
            num = num / 7;
        }
        result = Integer.toString(num) + result;
        return isNag ?  "-" + result : result;
    }
}
