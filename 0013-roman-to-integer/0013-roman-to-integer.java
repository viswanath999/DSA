class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>m=new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int n=s.length();
        int prev=m.get(s.charAt(n-1));
        int ans=0;
        ans=prev;
        for(int i=n-2;i>=0;i--){
            int cur=m.get(s.charAt(i));
            if(cur>=prev){
                ans=ans+cur;
            }
            else{
                ans=ans-cur;
            }
           prev=cur; 
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Solution obj=new Solution();
        System.out.println(obj.romanToInt(s));
    }
}