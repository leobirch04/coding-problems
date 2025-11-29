package leetcode;

public class koko {
    public int minEatingSpeed(int[] piles, int h) {
        
        int max = piles[0];                 // assume first element is max
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }

        int l = 1;
        int r = max;
        int bestK = Integer.MAX_VALUE;
        int mid = (r - l) / 2 + l;

        while(l <= r && l < max && r > 0){
            int total = 0;
            
            for (double i : piles) {
                total += Math.ceil(i / mid);
            }System.out.println(total + " " + mid);
            if (mid < bestK && total <= h) {
                bestK = mid;
            }

            if (total > h) {
                l = mid + 1;
            }else{
                r = mid - 1;
            }

            mid = (r - l) / 2 + l;


        }

        return bestK;
    }
}
