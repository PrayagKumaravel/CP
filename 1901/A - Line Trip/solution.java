import java.util.*;
public class ALineTrip{
    public static void main(String[] args){
        Scanner pr=new Scanner(System.in);
        int t=pr.nextInt();
        while(t-- > 0){
            int n=pr.nextInt();
            int x=pr.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=pr.nextInt();
            }
            //find max diff between station since, my fuel must be atleast the max dis to reach from 
            //one stattion to other and also 0 to 1st station and last station to x
            int max=Integer.MIN_VALUE;
            for(int i=1;i<n;i++){
                max=Math.max(max,arr[i]-arr[i-1]);
            }
            max=Math.max(arr[0],Math.max(max,2*(x-arr[arr.length-1])));
            System.out.println(max);
        }
        pr.close();
    }
}