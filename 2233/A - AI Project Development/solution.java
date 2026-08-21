import java.util.*;
public class Sol{
     public static void main(String[] args){
          Scanner pr=new Scanner(System.in);
          int t=pr.nextInt();
          while(t>0){
               long n=pr.nextLong();
               long x=pr.nextLong();
               long y=pr.nextLong();
               long z=pr.nextLong();
               System.out.println(finder(n, x, y, z));
               t--;
          }
          pr.close();
     }
 
     public static long finder(long n,long x,long y,long z){
          // int timenikitha=(n+y-1)/y;
          // int timeai=((n+(10*y)-1)/(10*y))+z;
          // int timemaxim=(n+x-1)/x;
          long time=(n+(x+y)-1)/(x+y);
          long ai=z;
          long lines=0;
          while(ai>0){
               lines+=x;
               ai--;
          }
          n=n-lines;
          long ai_time=z+(n+x+(10*y)-1)/(x+(10*y));
          return Math.min(time,ai_time);
     }
}