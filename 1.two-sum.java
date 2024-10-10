/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],i);
        }

        for(int i = 0; i < nums.length; i++){
            int possible = target - nums[i];
            if(map.containsKey(possible) && map.get(possible) != i){
                result = new int[]{i,map.get(possible)};
            }
        }

        return result;
    }
}
// @lc code=end

