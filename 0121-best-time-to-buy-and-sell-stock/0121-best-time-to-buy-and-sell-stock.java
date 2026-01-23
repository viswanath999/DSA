import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int minimum=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            int max_profit=prices[i]-minimum;
             profit=Math.max(max_profit,profit);
             minimum=Math.min(minimum,prices[i]);
        }
        return profit;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        str=str.replace("[","").replace("]","");
        String[] str1=str.split(",");
        int [] prices=new int[str1.length];
        for(int i=0;i<prices.length;i++){
            prices[i]=Integer.parseInt(str1[i]);
        }
        Solution obj=new Solution();
        System.out.println(obj.maxProfit(prices));
    }
}