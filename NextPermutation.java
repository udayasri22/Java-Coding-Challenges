class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length - 2;

        while (n >= 0 && nums[n] >= nums[n + 1]) {
            n--;
        }

        if (n >= 0) {
            int i = nums.length - 1;

            while (i >= 0 && nums[i] <= nums[n]) {
                i--;
            }

            swap(nums, n, i);
        }

        reverse(nums, n + 1);
    }

    public void swap(int[] nums, int n, int i) {
        int t = nums[n];
        nums[n] = nums[i];
        nums[i] = t;
    }

    public void reverse(int[] nums, int s) {
        int e = nums.length - 1;

        while (s < e) {
            swap(nums, s, e);
            s++;
            e--;
        }
    }
}
