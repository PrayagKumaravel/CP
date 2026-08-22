import java.util.*;
public class ADoremySPaint3{
    public static void main(String[] args){
        Scanner pr=new Scanner(System.in);
        int t=pr.nextInt();
        while(t-- > 0){
            int n=pr.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=pr.nextInt();
            }
            if(n==2){
                System.out.println("Yes");
                continue;
            }
            HashMap<Integer,Integer> hash=new HashMap<>();
            for(int x:arr){
                if(hash.containsKey(x)){
                    hash.put(x,hash.get(x)+1);
                }
                else{
                    hash.put(x,1);
                }
            }
            if(hash.size()>2){
                System.out.println("No");
                continue;
            }
            if(hash.size()==1){
                System.out.println("Yes");
                continue;
            }
            if(n%2==0){
                int count=0;
                for(int x:hash.values()){
                    if(x!=n/2){
                        count++;
                    }
                }
                if(count!=0){
                    System.out.println("No");
                    continue;
                }
                System.out.println("Yes");
                continue;
            }
            else{
                int count=0;
                for(int x:hash.values()){
                    if(x!=n/2){
                        count++;
                    }
                }
                if(count==1){
                    System.out.println("Yes");
                    continue;
                }
                System.out.println("No");
                continue;
            }
        }
        pr.close();
    }
}