class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();
        int minBanana = end;

        while(start <= end){
            int mid = (end + start)/2;
            int estBanana = checkIfLessThanH(piles, mid);

            if(estBanana <= h){
                minBanana = mid;
                end =  mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return minBanana;
    }

    int checkIfLessThanH(int[] arr, int k){
        int totalTime = 0;
        for(int i = 0; i < arr.length; i++){
            totalTime += Math.ceil((double) arr[i] / k);
        }
        return totalTime;
    }
}
