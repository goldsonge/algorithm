import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> typeSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            typeSet.add(nums[i]);
        }

        int maxPick = nums.length / 2; 
        int typeCount = typeSet.size();

        return Math.min(maxPick, typeCount);
    }
}