import java.util.*;
 
public class Sol {
    private static final int MAX_STATES = 150;
    
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
        
        if (!pr.hasNextInt()) return;
        int t = pr.nextInt();
        StringBuilder sb = new StringBuilder();
        
        long[] keysA = new long[MAX_STATES];
        long[] valsA = new long[MAX_STATES];
        long[] keysB = new long[MAX_STATES];
        long[] valsB = new long[MAX_STATES];
        
        while (t-- > 0) {
            long a = pr.nextLong();
            long b = pr.nextLong();
            long x = pr.nextLong();
            
            int sizeA = getReachableStates(a, x, keysA, valsA);
            int sizeB = getReachableStates(b, x, keysB, valsB);
            
            long minOperations = Math.abs(a - b);
            
            for (int i = 0; i < sizeA; i++) {
                long uA = keysA[i];
                long costA = valsA[i];
                
                for (int j = 0; j < sizeB; j++) {
                    long uB = keysB[j];
                    long costB = valsB[j];
                    
                    long meetingPoint = Math.max(uA, uB);
                    long totalCost = costA + (meetingPoint - uA) + costB + (meetingPoint - uB);
                    
                    if (totalCost < minOperations) {
                        minOperations = totalCost;
                    }
                }
            }
            sb.append(minOperations).append("
");
        }
        System.out.print(sb.toString());
        pr.close();
    }
 
    private static int getReachableStates(long start, long x, long[] keys, long[] vals) {
        int size = 0;
        
        long[] valQueue = new long[MAX_STATES];
        long[] costQueue = new long[MAX_STATES];
        int head = 0;
        int tail = 0;
        
        keys[size] = start;
        vals[size] = 0;
        size++;
        
        valQueue[tail] = start;
        costQueue[tail] = 0;
        tail++;
        
        while (head < tail) {
            long u = valQueue[head];
            long currentCost = costQueue[head];
            head++;
            
            if (u == 0) continue;
            
            long v1 = u / x;
            long cost1 = currentCost + 1;
            
            int idx1 = -1;
            for (int i = 0; i < size; i++) {
                if (keys[i] == v1) {
                    idx1 = i;
                    break;
                }
            }
            
            if (idx1 == -1) {
                keys[size] = v1;
                vals[size] = cost1;
                size++;
                valQueue[tail] = v1;
                costQueue[tail] = cost1;
                tail++;
            } else if (cost1 < vals[idx1]) {
                vals[idx1] = cost1;
                valQueue[tail] = v1;
                costQueue[tail] = cost1;
                tail++;
            }
            
            long rem = u % x;
            long neededAdds = x - rem;
            long v2 = u / x + 1;
            long cost2 = currentCost + neededAdds + 1;
            
            int idx2 = -1;
            for (int i = 0; i < size; i++) {
                if (keys[i] == v2) {
                    idx2 = i;
                    break;
                }
            }
            
            if (idx2 == -1) {
                keys[size] = v2;
                vals[size] = cost2;
                size++;
                valQueue[tail] = v2;
                costQueue[tail] = cost2;
                tail++;
            } else if (cost2 < vals[idx2]) {
                vals[idx2] = cost2;
                valQueue[tail] = v2;
                costQueue[tail] = cost2;
                tail++;
            }
        }
        return size;
    }
}