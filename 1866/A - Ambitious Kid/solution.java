import java.util.*;
public class AAmbitiousKid{
    public static void main(String[] args){
        Scanner pr=new Scanner(System.in);
        int n=pr.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=pr.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for(int x:arr){
            min=Math.min(min,Math.abs(x));
        }
        System.out.println(min);
        pr.close();
    }
 
}