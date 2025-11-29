package leetcode;



public class search2D {

    boolean binarySearch( int l , int r, int[] arr, int target){

        if (l > r) return false;
        int mid = ((r -l) / 2) + l;
        if(target == arr[mid]) return true;
        System.out.println(arr[mid]);

        if (target > arr[mid]) {
            return binarySearch(mid + 1, r, arr, target);
        }
        return binarySearch(l ,mid - 1,  arr, target);
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length;
        int mid = (r -l) / 2 + l;

        while(l <= r && mid <= matrix.length -1 && mid >= 0){
            
            boolean check = binarySearch(0, matrix[mid].length-1, matrix[mid], target);
            int smallest = matrix[mid][0];
            if (check) {
                return true;
            }
            if (target < smallest) {
                r = mid -1;
            }else{
                l = mid+ 1;
            }
            mid = (r -l) / 2 + l;

        }

        return false;
    }
    
}
