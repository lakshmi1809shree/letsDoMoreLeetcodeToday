class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        int start=nums[0];
        int end=nums[n-1];
        for(int i=start;i<=end;i++){
            ans.add(i);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<ans.size();j++){
                if(ans.get(j)==nums[i]) ans.remove(Integer.valueOf(nums[i]));
            }
        }
        return ans;
    }
}