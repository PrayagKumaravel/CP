import java.util.*;
public class Sol{
     public static void main(String[] args){
          Scanner pr=new Scanner(System.in);
          int t=pr.nextInt();
          while(t>0){
               int n=pr.nextInt();
               
               int[] ans=finder(n);
               for(int i=0;i<ans.length;i++){
                    System.out.print(ans[i]+" ");
               }
               System.out.println();
               t--;
          }
          pr.close();
     }
 
     public static int[] finder(int n){
          int[] ans=new int[4*n];
          int x=1;
          int i=0;
          for(i=0;i<2*n;i++){
               if(x==(n+1)){
                    x=1;
               }
               ans[i]=x;
               x++;
          }
          x=2;
          while(i<3*n){
               if(x==(n+1)){
                    x=1;
               }
               ans[i]=x;
               i++;
               x++;
          }
          x=1;
          while(i<ans.length){
               ans[i]=x;
               x++;
               i++;
          }
          return ans;
     }
}