package wugui.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 *
 * @author chenziyang
 */
public class LeetCode1 {
    /*    
    给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
    你可以按任意顺序返回答案。

    示例 1：
    输入：nums = [2,7,11,15], target = 9
    输出：[0,1]
    解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
    */

    public static int[] twoSum1(int[] nums, int target) {
        int[] resultArray = new int[2];
        if (nums != null && nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        resultArray[0] = i;
                        resultArray[1] = j;
                    }
                }
            }
        }
        return resultArray;
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[] resultArray = new int[2];
        if (nums != null && nums.length > 0) {
            Map<Integer, Integer> sumMap = new HashMap<>(16);
            for (int i = 0; i < nums.length; i++) {
                if (sumMap.containsKey(target - nums[i])) {
                    resultArray[0] = sumMap.get(target - nums[i]);
                    resultArray[1] = i;
                }
                sumMap.put(nums[i], i);
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-3, 2, 4};
        int target = 1;
        int[] resultArray = twoSum1(nums, target);
        System.out.println(Arrays.toString(resultArray));
    }


}
