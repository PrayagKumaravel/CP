import java.util.*;
public class AGoalsOfVictory {
    public static void main(String[] args){
        Scanner pr=new Scanner(System.in);
        int t=pr.nextInt();
        while(t-- > 0){
            int n=pr.nextInt();
            int[] arr=new int[n-1];
            for(int i=0;i<arr.length;i++){
                arr[i]=pr.nextInt();
            }
            //sum of all n team efficiency is 0
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
            }
            System.out.println(-sum);
        }
        pr.close();
    }
}