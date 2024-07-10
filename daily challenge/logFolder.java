public class logFolder {
    public int minOperations(String[] logs) {
        
        int res = 0;

        for(int i = 0; i < logs.length; i++)
        {

            if(!(logs[i].equals("../") || logs[i].equals("./")))
            {
                res++;
            }

            if(logs[i].equals("../"))
            {
                res = Math.max(0, res - 1);
            }

        }

        return res;
    }
}
