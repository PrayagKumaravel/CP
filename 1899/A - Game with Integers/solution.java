import java.util.*;
public class AGameWithIntegers{
    public static void main(String[] args){
        Scanner pr=new Scanner(System.in);
        int t=pr.nextInt();
        while(t-- > 0){
            int n=pr.nextInt();
            System.out.println(n%3==0?"Second":"First");
        }
        pr.close();
    }
}