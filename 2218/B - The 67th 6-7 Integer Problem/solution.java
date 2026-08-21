import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner pr=new Scanner(System.in);
        int t=pr.nextInt();
        while(t>0){
            int[] arr=new int[7];
            long sum=0l;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<7;i++){
                arr[i]=pr.nextInt();
                //1+2+3+4+5+6+7
                sum+=(long)arr[i];
                //7
                max=Math.max(max,arr[i]);
            }
            //1+2+3+4+5+6+7 - 7 -> 1+2+3+4+5+6
            sum-=(long)max;
            //negate 6 -> sum and add max
            long final_ans=(-1l * sum) + ((long)max);
            System.out.println(final_ans);
            t--;
        }
        pr.close();
    }
}