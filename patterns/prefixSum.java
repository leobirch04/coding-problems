package patterns;

import java.util.ArrayList;

public class prefixSum {
    public static ArrayList<Integer> prefSum(int[] arr ){

        int len = arr.length;
        ArrayList<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(arr[0]);
        for(int x = 1; x < len; x++){
            prefixSum.add(prefixSum.get(x-1) + arr[x]);
        }

        return prefixSum;

    }
    
}
