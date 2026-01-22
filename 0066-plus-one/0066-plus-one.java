import java.util.*;
class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        str=str.replace("[","").replace("]","");
        String[] str1=str.split(",");
        int[] digits=new int[str1.length];
        for(int i=0;i<digits.length;i++){
            digits[i]=Integer.parseInt(str1[i]);
        }
        Solution obj=new Solution();
        System.out.println(obj.plusOne(digits));
    }
}