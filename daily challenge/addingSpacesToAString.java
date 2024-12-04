class Solution {
    public String addSpaces(String s, int[] spaces) {

        StringBuilder sb = new StringBuilder();
        int count = 0;
        int len = s.length();

        for(int i = 0; i < s.length(); i++) {
            if(count < spaces.length && i == spaces[count]) {
                sb.append(" ");
                count++;
            }
            sb.append(s.charAt(i));

        }


        return sb.toString();
    }
}