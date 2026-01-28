class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
             for(int j=i+1;j<nums.length && j-i<=k ;j++){
                 if(nums[i]==nums[j]){
                      return true;
                 }
        }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.replace("[","").replace("]","");
        String[] str1=str.split(",");
        int[] nums=new int[str1.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(str1[i]);
        }
        int k=sc.nextInt();
        Solution obj=new Solution();
        System.out.println(obj.containsNearbyDuplicate(nums,k));
    }
}