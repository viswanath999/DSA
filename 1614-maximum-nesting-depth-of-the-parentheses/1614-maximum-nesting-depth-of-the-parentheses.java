class Solution {
    public int maxDepth(String s) {
        int count=0;
        int maxi=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                maxi=Math.max(count,maxi);
            }
            else if(s.charAt(i)==')'){
                count--;
            }
        }
        return maxi;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        Solution obj=new Solution();
        System.out.println(obj.maxDepth(s));

    }
}