import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        int leader=nums[0];
        int majority=1;
        for(int i=0;i<nums.length;i++){
            if(majority==0){
                leader=nums[i];
                majority+=1;
            }
            else{
                if(leader==nums[i]){
                    majority+=1;
                }
                else{
                    majority-=1;
                }
            }
        }
        return leader;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        str=str.replace("[","").replace("]","");
        String[] str1=str.split(",");
        int[] nums=new int[str1.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(str1[i]);
        }
        Solution obj=new Solution();
        System.out.println(obj.majorityElement(nums));
    }
}