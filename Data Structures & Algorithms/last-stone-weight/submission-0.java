class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int num: stones){
            maxHeap.offer(num);
        }

        while(maxHeap.size() > 1){
            int max1 = maxHeap.poll();
            int max2 = maxHeap.poll();

            int newInt = max1 - max2;

            if(newInt > 0){
                maxHeap.offer(newInt);
            }   
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}
