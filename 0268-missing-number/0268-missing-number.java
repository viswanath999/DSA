import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<=n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(i==nums[j]){
                    count++;
                    break;
                }
            }
            if(count==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        String str=input.nextLine();
        str=str.replace("[","").replace("]","");
        String[] str1=str.split(",");
        int[] nums=new int[str1.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(str1[i]);
        }
        Solution obj=new Solution();
        System.out.println(obj.missingNumber(nums));
    }
}