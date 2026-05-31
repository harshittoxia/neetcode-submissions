class KthLargest {
    private int k;
    private PriorityQueue<Integer> minHeap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<Integer>();

        for(int i = 0; i < nums.length; i++){
            minHeap.add(nums[i]);
            if(minHeap.size() > k) minHeap.poll();
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        if(minHeap.size() > k) minHeap.poll();
        return minHeap.peek();
    }
}
