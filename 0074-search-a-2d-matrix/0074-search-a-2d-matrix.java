class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int low = 0;
        int high = (row*col)-1;
        while(low<=high){
            int mid = (low+high)/2;
            int i=mid/col;
            int j=mid%col;
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
}