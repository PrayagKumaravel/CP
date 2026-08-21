import java.util.*;
public class Solutio3{
    public static void main(String[] args){
        Scanner pr=new Scanner(System.in);
        int t=pr.nextInt();
        while(t>0){
            int n=pr.nextInt();
            int[] ans=generate(n);
            for(int i=0;i<ans.length;i++){
                System.out.println(ans[i]);
            }
            t--;
        }
        pr.close();
    }
    public static int[] generate(int n){
        int[] ans=new int[n];
        int k=0;
        int[] hash=new int[2*n];
        for(int i=1;i<=2*n;i++){
            if(k>=ans.length){
                break;
            }
            if(hash[i-1]!=1){
                ans[k]=i;
                hash[i-1]=1;
                int want_to_hash=i;
                if(k>0){
                    want_to_hash=ans[k]+ans[k-1];
                }
                if(want_to_hash-1 < 2*n){
                    hash[want_to_hash-1]=1;
                }
                
                k++;
            }
        }
        return ans;
    } 
}