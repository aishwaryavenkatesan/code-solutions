import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class letterCombinationsOfNumber {
    private Map<Character, String> letters = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
        );
    public List<String> letterCombinations(String digits) {
        
        List<String> res = new ArrayList<>();

        if(digits.length() == 0)
        return res;

        String cur = "";
        backtrack(digits, res, cur, 0);
        return res;
    }

    public void backtrack(String digits, List<String> res, String cur, int index)
    {
        if(cur.length() == digits.length())
        {
            res.add(cur);
            return;
        }

        if(index >= digits.length())
        return;

        String numberToLetter = letters.get(digits.charAt(index));
        for(char c : numberToLetter.toCharArray())
        {
            backtrack(digits, res, cur + c, index + 1);
        }
    }
}
