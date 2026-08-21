import java.util.*;
 
public class Sol {
 
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
 
        int t = pr.nextInt();
 
        while (t > 0) {
            int n = pr.nextInt();
            int k = pr.nextInt();
            String s = pr.next();
 
            System.out.println(finder(s, k));
 
            t--;
        }
 
        pr.close();
    }
 
    public static String finder(String s, int k) {
 
        for (int r = 0; r < k; r++) {
 
            int ones = 0;
 
            for (int i = r; i < s.length(); i += k) {
                if (s.charAt(i) == '1') {
                    ones++;
                }
            }
 
            if (ones % 2 != 0) {
                return "NO";
            }
        }
 
        return "YES";
    }
}