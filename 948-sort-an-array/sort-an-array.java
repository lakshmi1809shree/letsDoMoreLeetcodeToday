class Solution {
    public void merge(int[] nums,int low,int mid,int high){
        int left=low,right=mid+1;
        int[] temp=new int[high-low+1];
        int idx=0;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp[idx]=nums[left];
                left++;
                idx++;
            }else{
                temp[idx]=nums[right];
                right++;
                idx++;
            }
        }
        if(left<=mid){
            for(int i=left;i<=mid;i++)temp[idx++]=nums[i];
        }
        if(right<=high){
            for(int i=right;i<=high;i++){
                temp[idx++]=nums[i];
            }
        }
        for (int i = 0; i < temp.length; i++) {
            nums[low + i] = temp[i];
        }
    }
    public void solveByMergeSort(int[] nums,int low,int high){
        if(low>=high)return;
        int mid=low+(high-low)/2;
        solveByMergeSort(nums,low,mid);
        solveByMergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);       
    }
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        solveByMergeSort(nums,low,high);
        return nums;
    }
}