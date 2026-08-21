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
               if(finder(arr)==-1){
                    System.out.println("-1");
               }
               else{
                    System.out.println(arr[arr.length-1]+" "+arr[arr.length-2]);
               }
               System.out.println();
               t--;
          }
          pr.close();
     }
     public static int finder(int[] arr){
          Arrays.sort(arr);
          for(int i=arr.length-3;i>=0;i--){
               long rem=(long)arr[i+2]%(long)arr[i+1];
               if((long)arr[i]!=rem){
                    return -1;
               }
          }
          return 0;
     }
}