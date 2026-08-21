import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner pr=new Scanner(System.in);
        int t=pr.nextInt();
        for(int i=0;i<t;i++){
            int n=pr.nextInt();
            int k=pr.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=pr.nextInt();
            }
            
            System.out.println(equalizer(arr,k,n));
        }
        pr.close();
    }
    public static String equalizer(int[] arr,int k,int n){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if((sum&1)==1){
            return "YES";
        }
        int K=(k*n);
        //since A does change at odd turn after that B takes the turn to play ....so if
        //K is odd -> since B starts B will win, if K is even , since B starts , A wins
        return (K&1)==1?"NO":"YES";
    }
}