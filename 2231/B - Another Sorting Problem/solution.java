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
               System.out.println(ispossible(arr));
               t--;
          }
          pr.close();
     }
     public static String ispossible(int[] arr){
          int max=0;
          for(int i=1;i<arr.length;i++){
               if(arr[i]>=arr[i-1]){
                    continue;
               }
               max=Math.max(max,arr[i-1]-arr[i]);
          }
          if(max==0){
               return "YES";
          }
          //always 0th is valid
          for(int i=1;i<arr.length;i++){
               if(arr[i]<arr[i-1]){//decresing part
                    arr[i]+=max;
                    if(arr[i]<arr[i-1]){
                         return "NO";
                    }
               }
          }
          return "YES";
     }
}