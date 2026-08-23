import java.util.*;
public class CTargetPractice {
    public static void main(String[] args){
        Scanner pr=new Scanner(System.in);
        int t=pr.nextInt();
        while(t-- > 0){
            char[][] maze=new char[10][10];
            for(int i=0;i<10;i++){
                String s=pr.next();
                for(int j=0;j<10;j++){
                    maze[i][j]=s.charAt(j);
                }
            }
            System.out.println(solve(maze));
        }
        pr.close();
    }
    public static int solve(char[][] maze){
 
        //spiral traversal
        int top=0,bottom=maze.length-1;
        int left=0,right=maze[0].length-1;
        int count=0;
        int point=0;
        while(top<=bottom && left<=right){
            point++;
            for(int i=left;i<=right;i++){
                if(maze[top][i]=='X'){
                    count+=point;
                }
            }
            top++;
            for(int i=top;i<=bottom;i++){
                if(maze[i][right]=='X'){
                    count+=point;
                }
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    if(maze[bottom][i]=='X'){
                        count+=point;
                    }
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    if(maze[i][left]=='X'){
                        count+=point;
                    }
                }
                left++;
            }
        }
        return count;
    }
}