class Solution {
    public int subtractProductAndSum(int n) {
        int multiple = 1;
        byte sum =0;
        while(n>0) {
            multiple*=n%10;
            sum+=n%10;
            n/=10;
        }
        return multiple -sum;
    }
}
