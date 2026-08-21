import java.util.*;
public class Prayag{
     public static void main(String[] args){
          Scanner pr=new Scanner(System.in);
          int t=pr.nextInt();
          while(t>0){
               int n=pr.nextInt();
               int k=pr.nextInt();
               int[] arr=new int[n];
               for(int i=0;i<n;i++){
                    arr[i]=pr.nextInt();
               }
               int count=0;
               for(int i=1;i<arr.length;i++){
                    if(arr[i]<arr[i-1]){
                         count=1;
                         break;
                    }
               }
               System.out.println(count==0?"YES":k<=1?"NO":"YES");//when k>=2 its actually bubble sort since i can take atmost k adajcent , i will alwys take 2 adj
               t--;
          }
          pr.close();
     }
}