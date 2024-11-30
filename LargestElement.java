public class LargestElement {
    public static int findLargest(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9};
        System.out.println(findLargest(arr));
    }
}
