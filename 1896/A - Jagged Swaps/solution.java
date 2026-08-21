import java.util.*;
public class AJaggedSwaps{
    public static void main(String[] args){
        Scanner pr=new Scanner(System.in);
        int t=pr.nextInt();
        while(t-- > 0){
            int n=pr.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=pr.nextInt();
            }
            int min=Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                min=Math.min(min,arr[i]);
            }
            System.out.println(min==arr[0]?"YES":"NO");
        }
        pr.close();
    }
}