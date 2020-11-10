class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int candy : candies){
            if(max<candy)
                max = candy;
        }
        List<Boolean> ans = new ArrayList<>();
        for(int i=0; i<candies.length;i++) {
            candies[i]+=extraCandies;
            if(candies[i]>= max)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}
