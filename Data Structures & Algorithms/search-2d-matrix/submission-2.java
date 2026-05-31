class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][matrix[i].length - 1] >= target){
                return binarsearchresult(matrix[i], target);
            }else{
                continue;
            }
        }
        return false;
    }

    boolean binarsearchresult(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return true;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return false;
    }
}
