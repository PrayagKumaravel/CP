import java.util.*;
public class AButtons{
    public static void main(String[] args) {
        Scanner pr=new Scanner(System.in);
        int t=pr.nextInt();
        while(t-- > 0){
            int a=pr.nextInt();
            int b=pr.nextInt();
            int c=pr.nextInt();
            if((c&1) == 1){
                //katy
                if(b>a){
                    System.out.println("Second");
                }
                else{
                    System.out.println("First");
                }
                continue;
            }
            //anna
            if(a>b){
                System.out.println("First");
                continue;
            }
            System.out.println("Second");
        }
        pr.close();
    }
}