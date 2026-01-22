import java.util.*;

class Solution {
    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Insert position
        return left;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.replace("[", "").replace("]", "");
        String[] str1 = str.split(",");
        int[] nums = new int[str1.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(str1[i]);
        }
        int target = input.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.searchInsert(nums, target));
    }
}
