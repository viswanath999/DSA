class Solution {
    public int myAtoi(String s) {
        int ans=0;
        int sign=1;
        int i=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' '){
            i++;
            }
            if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            if(ans>(Integer.MAX_VALUE-digit)/10){
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
          ans=ans*10+digit;   
          i++;
        }
        return sign*ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Solution obj=new Solution();
        System.out.println(obj.myAtoi(s));
    }
}