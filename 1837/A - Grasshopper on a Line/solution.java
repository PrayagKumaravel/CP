import java.util.*;
public class AGrasshopperOnALine{
    public static void main(String[] args) {
        Scanner pr=new Scanner(System.in);
        int t=pr.nextInt();
        while(t-- > 0){
            int x=pr.nextInt();
            int k=pr.nextInt();
            if(x%k==0){
                System.out.println("2
"+(x-1)+" "+1);
            }
            else{
                System.out.println("1
"+x);
            }
        }
        pr.close();
    }
}