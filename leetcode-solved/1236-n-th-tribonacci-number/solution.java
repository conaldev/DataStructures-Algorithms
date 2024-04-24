class Solution {
    static int[] arrayData = new int[38]; 
    public int tribonacci(int n) { 
        if (n == 0) return 0; if (n == 1) return 1; 
        if (n == 2) return 1; 
        if (arrayData[n] != 0) 
            return arrayData[n];
        arrayData[n] = tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1); 
        return arrayData[n]; 
    }
        

}
