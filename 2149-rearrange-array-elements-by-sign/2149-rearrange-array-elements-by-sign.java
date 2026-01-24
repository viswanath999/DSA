import java.util.*;
class Solution {
    public int[] rearrangeArray(int[] nums) {
      int n=nums.length;
      int[] ans=new int[n];
      int pos=0;
      int neg=1;
      for(int i=0;i<n;i++){
        if(nums[i]>0){
            ans[pos]=nums[i];
            pos+=2;
        }
        else{
            ans[neg]=nums[i];
            neg+=2;
        }
      }  
      return ans;
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
        obj.rearrangeArray(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        }
    }