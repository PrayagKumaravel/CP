import java.util.*;
public class Solutio3{
    public static void main(String[] args){
        Scanner pr=new Scanner(System.in);
        int t=pr.nextInt();
        while(t>0){
            int n=pr.nextInt();
            int a=pr.nextInt();
            int b=pr.nextInt();
            System.out.println(findmin(n,a,b));
            t--;
        }
        pr.close();
    }
    public static long findmin(int n,int a,int b){
        if((3*a)<b){
            return (long)n*(long)a;
        }
        long amount=(long)(((long)n/3)*(long)b);
        if(n%3>0){
            if(((n%3)*a)<b){
                amount+=(long)(((long)n%3)*(long)a);
            }
            else{
                amount+=(long)b;
            }
        }
        return amount;
    }
    
}