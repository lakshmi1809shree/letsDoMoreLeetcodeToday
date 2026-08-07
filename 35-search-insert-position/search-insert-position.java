class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int mid=0;
        boolean flag=false;
        while(low<=high){
             mid=low+(high-low)/2;
            if(nums[mid]>target){
                high=mid-1;
            }else if(nums[mid]<=target){
                if(nums[mid]==target){
                    flag=true;
                }
                low=mid+1;
            }
        }
        return (flag==true)?high:low;
    }
}