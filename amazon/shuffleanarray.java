import java.util.Random;

class Solution {
    int[] copy;
    int[] nums;
    Random random;

    public Solution(int[] nums) {
        this.nums = nums;

        this.copy = new int[nums.length];
        for (int i = 0; i < copy.length; i++) {
            this.copy[i] = this.nums[i];
        }

        this.random = new Random();
    }

    public int[] reset() {
        for (int i = 0; i < copy.length; i++) {
            this.nums[i] = this.copy[i];
        }
        return this.nums;
    }

    private void swap(int i, int j) {
        int temp = this.nums[i];
        this.nums[i] = this.nums[j];
        this.nums[j] = temp;
    }

    public int[] shuffle() {
        // Fisher Yates shuffle
        // Reference: https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle
        for (int i = this.nums.length - 1; i >= 1; i--) {
            int j = this.random.nextInt(i + 1);
            swap(i, j);
        }

        return this.nums;
    }
}