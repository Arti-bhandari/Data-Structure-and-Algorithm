class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++){
            hash.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            int valueToFound = target-nums[i];
            if(hash.containsKey(valueToFound) && hash.get(valueToFound) != i){
                return new int[]{i, hash.get(valueToFound)};
            }
        }
        return new int[]{0,0};

    }
}
