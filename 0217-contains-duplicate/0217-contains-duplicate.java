import java.util.*;

class Solution {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input example: [1,2,3,1]
        String str = input.nextLine();
        str = str.replace("[", "").replace("]", "");

        String[] str1 = str.split(",");
        int[] nums = new int[str1.length];

        for (int i = 0; i < str1.length; i++) {
            nums[i] = Integer.parseInt(str1[i].trim());
        }

        Solution obj = new Solution();
        System.out.println(obj.containsDuplicate(nums));

        input.close();
    }
}
