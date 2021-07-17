package wugui.leetcode;

import java.util.Arrays;

/**
 * 删除有序数组中的重复项
 *
 * @author chenziyang
 */
public class LeetCode26 {

    /**
     * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     * <p>
     * 提示：
     * 0 <= nums.length <= 3 * 104
     * -104 <= nums[i] <= 104
     * nums 已按升序排列
     */

    public static int removeDuplicates1(int[] nums) {
        int length = 0;
        int lastNumber = 105;
        if (nums != null && nums.length > 0) {
            length = nums.length;
            for (int i = 1; i < nums.length; i++) {
                while (nums[i] == nums[i - 1]) {
                    for (int j = i + 1; j < nums.length; j++) {
                        nums[j - 1] = nums[j];
                    }
                    nums[nums.length - 1] = lastNumber++;
                    length--;
                }
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length = removeDuplicates1(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(length);
    }

}

