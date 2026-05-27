class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> tempMap = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            int diff = target-num;

            if (tempMap.containsKey(diff)){
                return new int[]{tempMap.get(diff), i};
            }
            tempMap.put(num,i);
        }
        return new int[]{};
    }
}
