class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prefixSum = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            int diff = target - nums[i];

            if (prefixSum.containsKey(diff)) {
                return new int[] {prefixSum.get(diff), i};
            }

            prefixSum.put(nums[i], i);
        }
        return new int[]{};
    }
}
