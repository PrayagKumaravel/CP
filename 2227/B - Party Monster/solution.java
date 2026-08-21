import java.util.*;
public class Solution{
     public static void main(String[] args){
          Scanner pr=new Scanner(System.in);
          int t=pr.nextInt();
          while(t>0){
               int n=pr.nextInt();
               String s=pr.next();
               System.out.println(checker(s));
               t--;
          }
          pr.close();
     }
     public static String checker(String s){
          int opening=0,closing=0;
          for(int i=0;i<s.length();i++){
               if(s.charAt(i)=='('){
                    opening++;
               }
               else{
                    closing++;
               }
          }
          return opening==closing?"YES":"NO";
     }
}