//import java.util.HashSet;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();

        for (int num : nums) {
            if (!map.contains(num)) map.add(num);
            else return true;
        }
        return false;
    }
}