

                        /*
                         * Don't write better error messages, write code that doesn't need them.
                                             ~ Jason C. McDonald
                         */


/*
 * Climb Stairs With Variable Jumps
Easy  Prev   Next
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. You are given n numbers, where ith element's value represents - till how far from the step you 
     could jump to in a single move.  
     You can of course jump fewer number of steps in the move.
4. You are required to print the number of different paths via which you can climb to the top.
Input Format
A number n
.. n more elements
Output Format
A number representing the number of ways to climb the stairs from 0 to top.
Question Video

  COMMENTConstraints
0 <= n <= 20
0 <= n1, n2, .. <= 20
Sample Input
10
3
3
0
2
1
2
4
2
0
0
Sample Output
5
 */




import java.io.*;
import java.util.*;

public class tabuation {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int dp[] = new int[n + 1];
        int ans = climbStairs(0, n, arr, dp);
        System.out.println(ans);
    }

    public static int climbStairs(int SRC, int dst, int arr[], int dp[]) {
        for (int src = dst; src >= 0; src--) {

            if (src == dst) {
                dp[src] = 1;
                continue;
            }

            // if(dp[src] !=0){
            // return dp[src];
            // }

            int count = 0;
            for (int jump = 1; jump <= arr[src]; jump++) {
                if (src + jump <= dst) {
                    count += dp[src + jump]; // climbStairs(src+jump , dst , arr , dp);
                }

            }
            dp[src] = count;

        }
        return dp[SRC]; // 0th idx value
    }

}