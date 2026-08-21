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
               System.out.println(countmax(arr));
               t--;
          }
          pr.close();
     }
     public static int countmax(int[] arr){
          int countopr=0;
          int ones=0,twos=0,zeros=0;
          for(int i=0;i<arr.length;i++){
               if(arr[i]==0){
                    zeros++;
               }
               else if(arr[i]==1){
                    ones++;
               }
               else{
                    twos++;
               }
          }
          countopr=zeros+Math.min(ones,twos);
          if(ones<twos){
               twos-=ones;
               ones=0;
          }
          else{
               ones-=twos;
               twos=0;
          }
          countopr+=(twos/3) + (ones/3);
          return countopr;
     }
}