import java.util.*;
public class Sol{
     public static void main(String[] args){
          Scanner pr=new Scanner(System.in);
          int t=pr.nextInt();
          while(t>0){
               int n=pr.nextInt();
               int[] arr=new int[n];
               for(int i=0;i<n;i++){
                    arr[i]=pr.nextInt();
               }
               System.out.println(finder(arr));
               t--;
          }
          pr.close();
     }
     public static int finder(int[] arr){
          int max=Integer.MIN_VALUE;
          int min=Integer.MAX_VALUE;
          for(int i=0;i<arr.length;i++){
               max=Math.max(max,arr[i]);
               min=Math.min(min,arr[i]);
          }
          return max+1-min;
     }
}