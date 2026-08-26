import java.util.*;
public class AArrayColoring {
    public static void main(String[] args){
        Scanner pr=new Scanner(System.in);
        int t=pr.nextInt();
        while(t-- > 0){
            int n=pr.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=pr.nextInt();
            }
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
            }
            System.out.println((sum&1)==1?"NO":"YES");
        }
        pr.close();
    }
}