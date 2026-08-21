import java.util.*;
public class Solo{
     public static void main(String[] args){
          Scanner pr=new Scanner(System.in);
          int t=pr.nextInt();
          while(t>0){
               int n=pr.nextInt();
               t--;
               int[] arr=permutation(3*n);
               for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
               }
               System.out.println();
          }
          pr.close();
     }
     public static int[] permutation(int n){
          int[] arr=new int[n];
          int i=1,j=n;
          int k=n-1;
          boolean turn1=true;
          while(k>=0){
               if(turn1){
                    arr[k]=j;
                    k--;
                    j--;
                    arr[k]=j;
                    k--;
                    j--;
                    turn1=false;
               }
               else{
                    arr[k]=i;
                    k--;
                    i++;
                    turn1=true;
               }
          }
          return arr;
     }
}