import java.util.*;
public class BSequenceGame{
    public static void main(String[] args){
        Scanner pr=new Scanner(System.in);
        int t=pr.nextInt();
        while(t-- > 0){
            int n=pr.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=pr.nextInt();
            }
            int count=0;
            for(int i=1;i<n;i++){
                if(arr[i]<arr[i-1]){
                    count++;
                }
            }
            System.out.println(count+n);
            for(int i=0;i<n;i++){
                if(i==0){
                    System.out.print(arr[i]+" ");
                    continue;
                }
                if(arr[i]<arr[i-1]){
                    System.out.print(arr[i]+" "+arr[i]+" ");
                }
                else{
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
        pr.close();
    }
}