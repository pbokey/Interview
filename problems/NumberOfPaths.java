class NumberOfPaths
{
    // Returns count of possible paths to reach  
    // cell at row number m and column number n from 
    // the topmost leftmost cell (cell at 1, 1) 
    static int numberOfPaths(int m, int n) 
    { 
        // Create a 1D array to store results of subproblems 
        int[] dp = new int[n]; 
        dp[0] = 1; 
  
        for (int i = 0; i < m; i++) { 
            for (int j = 1; j < n; j++) { 
                dp[j] += dp[j - 1]; 
            } 
        } 

        return dp[n - 1]; 
    }
   
    // Driver program to test above function 
    public static void main(String args[]) 
    { 
        System.out.println(numberOfPaths(3, 3)); 
    }
}