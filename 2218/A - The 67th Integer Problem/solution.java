import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner pr=new Scanner(System.in);
        int t=pr.nextInt();
        while(t>0){
            int x=pr.nextInt();
            //min(x,y) -> -67 to x..so maximum is x-> when y>=x min(x,y) is x
            System.out.println(x);
            t--;
        }
        pr.close();
    }
}