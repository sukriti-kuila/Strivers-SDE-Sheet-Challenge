class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0) return 0;
        Arrays.sort(nums);
        int lastElement = Integer.MIN_VALUE;
        int count = 1;
        int ans = 1;
        for (int e : nums)
        {
            if (e==lastElement+1)
            {
                count++;
                lastElement = e;
            }
            else if (e>lastElement+1)
            {
                count = 1;
                lastElement = e;
            }
            ans = Math.max(count,ans);
        }
        return ans;
    }
}
