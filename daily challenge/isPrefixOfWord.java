public class isPrefixOfWord {
        public int isPrefixOfWord1(String sentence, String searchWord) {
            String[] subStrings = sentence.split(" ");
    
            for(int i = 0; i < subStrings.length; i++) {
                if(subStrings[i].startsWith(searchWord)) {
                    return i + 1;
                }
            }
    
            return -1;
    
        }

}
