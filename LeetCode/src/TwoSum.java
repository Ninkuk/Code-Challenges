public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int outer = 0; outer < nums.length; outer++) {
            int leftNum = nums[outer];
            for (int inner = outer + 1; inner < nums.length; inner++) {
                if (leftNum + nums[inner] == target) {
                    return new int[]{outer, inner};
                }
            }
        }

        return null;
    }
}
