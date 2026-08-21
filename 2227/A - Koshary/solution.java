import java.util.*;
public class Solution{
     public static void main(String[] args){
          Scanner pr=new Scanner(System.in);
          int t=pr.nextInt();
          while(t>0){
               int x=pr.nextInt();
               int y=pr.nextInt();
               if((x&1)==1 && (y&1)==1){
                    System.out.println("NO");
               }
               else{
                    System.out.println("YES");
               }
               t--;
          }
          pr.close();
     }
}