class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        /// we have 4 corners 
        int n=matrix.length;
        int m=matrix[0].length;
        List<Integer> ans=new ArrayList<>();
         if(matrix.length==0)return ans;
        /**→ Right:  row fixed at rowBegin,  col goes colBegin → colEnd
            ↓ Down:   col fixed at colEnd,    row goes rowBegin+1 → rowEnd  
            ← Left:   row fixed at rowEnd,    col goes colEnd-1 → colBegin
            ↑ Up:     col fixed at colBegin,  row goes rowEnd-1 → rowBegin+1
         */
        int row=0;
        int col=0;
        int rowend=n-1;
        int colend=m-1;

       while(row<=rowend && col<=colend){
            for(int i=col;i<=colend;i++){
                ans.add(matrix[row][i]);
            }
            row++;
            for(int i=row;i<=rowend;i++){
                ans.add(matrix[i][colend]);
            }
            colend--;
            if(row<=rowend){
                for(int i=colend;i>=col;i--){
                    ans.add(matrix[rowend][i]);
                }
                 rowend--;
            }
            if(col<=colend){
                for(int i=rowend;i>=row;i--){
                    ans.add(matrix[i][col]);
                }
                 col++;
            }
           
       }

       return ans;
    }
}