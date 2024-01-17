import java.util.List;

public class wordBreak {
        public boolean wordBreakMethod(String s, List<String> wordDict) {
        
        boolean[] dp = new boolean[s.length() + 1];
        dp[s.length()] = true;

        for(int i = s.length() - 1; i >=0; i--)
        {
            for(String str: wordDict)
            {
                if((i + str.length() <= s.length()) && s.startsWith(str, i))
                {
                    dp[i] = dp[i + str.length()];
                    
                }
                // System.out.println("vale of dp for i " + dp[i] + " i = " + i);

                if(dp[i])
                break;
            }
        }

        return dp[0];


    }
    
}
