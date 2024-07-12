import java.util.Stack;

public class maxmumGainFromSubstrings {

    public int maximumGain(String s, int x, int y) {
        Stack<Character> res = new Stack<>();

        char c1 = 'a';
        char c2 = 'b';
        int sum = 0;
        int numToAdd = x;
        int numLater = y;
        String toCheck = "ba";
        StringBuilder ans = new StringBuilder();

        if(x < y)
        {
            c1 = 'b';
            c2 = 'a';
            numToAdd = y;
            numLater= x;
            toCheck = "ab";
        }

        for(int i =0; i < s.length(); i++)
        {
            if(s.charAt(i) != c2)
            {
                res.push(s.charAt(i));
            }

            else
            {
                if(!res.isEmpty())
                {
                    if(res.peek() == c1)
                {
                    res.pop();
                    sum+=numToAdd;
                }
                else
                {
                    res.push(s.charAt(i));
                }
                }
                

                else
                {
                    res.push(s.charAt(i));
                }
            }
        }

        while(!res.isEmpty())
        {
            char ch = res.pop();
            ans.append(ch);
        }

        ans.reverse();
        String s2 = ans.toString();
        System.out.println(s2);

        for(int i = 0; i < s2.length(); i++)
        {
            if(s2.charAt(i) != c1)
            {
                res.push(s2.charAt(i));
            }

            else
            {
                if(!res.isEmpty())
                {
                    if(res.peek() == c2)
                {
                    res.pop();
                    sum+=numLater;
                }

                else
                {
                    res.push(s2.charAt(i));
                }
                }


                else
                {
                    res.push(s2.charAt(i));
                }
            }
        }

        return sum;

    }

}
