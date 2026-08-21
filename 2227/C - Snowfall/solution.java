 
import java.util.*;
public class Solution{
     public static void main(String[] args){
          Scanner pr=new Scanner(System.in);
          int t=pr.nextInt();
          while(t>0){
               int n=pr.nextInt();
               int[] arr=new int[n];
               for(int i=0;i<n;i++){
                    arr[i]=pr.nextInt();
               }
               work(arr);
               t--;
          }
          pr.close();
     }
     public static void work(int[] arr){
          int[][] notes=new int[arr.length][2];
          for(int i=0;i<arr.length;i++){
               if(arr[i]%6==0){
                    notes[i][0]=6;
                    notes[i][1]=i;
               }
               else if(arr[i]%3==0){
                    notes[i][0]=3;
                    notes[i][1]=i;
               }
               else if(arr[i]%2==0){
                    notes[i][0]=2;
                    notes[i][1]=i;
               }
               else{
                    notes[i][1]=i;
               }
          }
          Arrays.sort(notes,(a,b)-> Integer.compare(b[0],a[0]));
          List<Integer> hr=new ArrayList<>();
          List<Integer> two=new ArrayList<>();
          for(int i=0;i<notes.length;i++){
               if(notes[i][0]!=2){
                    hr.add(arr[notes[i][1]]);
               }
               else{
                    two.add(arr[notes[i][1]]);
               }
          }
          for(Integer x:hr){
               System.out.print(x+" ");
          }
          for(Integer x:two){
               System.out.print(x+" ");
          }
          System.out.println();
     }
}