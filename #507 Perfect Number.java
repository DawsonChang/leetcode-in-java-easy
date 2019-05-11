class Solution {
    public boolean checkPerfectNumber(int num) {
        int n = 2;
        int count = 1;
        while(n < Math.sqrt(num)){
            if(num % n == 0){
                count+=n;
                count+=num/n;
            }
            n++;
        }
        if(num % Math.sqrt(num) == 0){
            count+=Math.sqrt(num);
        }
        if(count == num)
            return true;
        return false;
    }
}
