class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];

        for (int n : count.keySet()) {
            int c = count.get(n);

            if (bucket[c] == null) {
                bucket[c] = new ArrayList<>();
            }
            bucket[c].add(n);
        }

        int[] res = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i>=0; i--) {
            if (bucket[i] != null) {
                for (int n : bucket[i]) {
                    res[index] = n;
                    index++;
                }
                if (index == k) return res;
            }
        }
        return res;
    }
}
