class Solution {
    public int countNegatives(int[][] grid) {
        /// 4 3 2 -1
        /// 3 2 1 -1
        /// 1 1 -1 -2
        // -1 -1 -2 -3
        // har rw wise , nikal kitna negtive num 
        // added 
        // return add
        int n=grid.length; 
        int rowlength=grid[0].length;
        int sum=0;
        for(int i=0;i<n;i++){
           for(int j=0;j<rowlength;j++){
            if(grid[i][j]<0){
                sum++;
            }
           }
           
        }

        return sum;
    }
}