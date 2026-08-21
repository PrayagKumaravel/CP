import java.util.*;
public class ACoverInWater{
    public static void main(String[] args){
        Scanner pr=new Scanner(System.in);
        int t=pr.nextInt();
        while(t-- > 0){
            int n=pr.nextInt();
            String s=pr.next();
            int count=0;
            int consecutive_empty=0;
            boolean consecutive_greater_than_2=false;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='.'){
                    consecutive_empty++;
                    count++;
                }
                else{
                    consecutive_empty=0;
                }
                if(consecutive_empty>2){
                    consecutive_greater_than_2=true;
                }
            }
            System.out.println(consecutive_greater_than_2?"2":count);
        }
        pr.close();
    }
}