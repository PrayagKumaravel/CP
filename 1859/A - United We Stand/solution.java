import java.util.*;
public class AUnitedWeStand{
    public static void main(String[] args) {
        Scanner pr=new Scanner(System.in);
        int t=pr.nextInt();
        while(t-- > 0){
            int n=pr.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=pr.nextInt();
            }
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int x:arr){
                min=Math.min(min,x);
                max=Math.max(max,x);
            }
            if(min==max){
                System.out.println("-1");
                continue;
            }
            int count=0;
            for(int x:arr){
                if(x!=max){
                    count++;
                }
            }
            System.out.println(count+" "+(arr.length-count));
            for(int x:arr){
                if(x!=max){
                    System.out.print(x+" ");
                }
            }
            System.out.println();
            while(count!=arr.length){
                System.out.print(max+" ");
                count++;
            }
            System.out.println();
        }
        pr.close();
    }
}