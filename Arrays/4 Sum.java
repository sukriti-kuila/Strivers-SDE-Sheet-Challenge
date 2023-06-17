class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++)
        {
            if (i==0 || nums[i] != nums[i-1])
            {
                for (int j=i+1; j<nums.length; j++)
                {
                    if (j==i+1 || nums[j] != nums[j-1])
                    {
                        int k = j+1;
                        int l = nums.length-1;        
                        while (k<l)
                        {
                            long sum = nums[i]+nums[j];
                            sum += nums[k]+nums[l];
                            if (sum>target)
                            {
                                while (k<l && nums[l]==nums[l-1]) l--;
                                l--;
                            }
                            else if (sum<target)
                            {
                                while (k<l && nums[k]==nums[k+1]) k++;
                                k++;
                            }
                            else
                            {
                                List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                                while (k<l && nums[k]==nums[k+1]) k++;
                                while (k<l && nums[l]==nums[l-1]) l--;
                                k++;
                                l--;
                                ans.add(temp);
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
}
