import java.util.Arrays;

public class LongestCommonPrefixSolution {

    public static void main(String[] args) {

        LongestCommonPrefixSolution lcp = new LongestCommonPrefixSolution();
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(lcp.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        int cont=0;
        char[] charArray = new char[200];
        String result;

        for (int i = 1; i < strs.length; i++) {

            for (int j = 0; j < strs[1].length(); j++) {

                if(strs[i].charAt(j) == strs[i-1].charAt(j)) {

                    charArray[j] = strs[i].charAt(j);
                    cont++;

                }else{
                    charArray[j] = ' ';
                }
            }
        }

        result = new String(charArray);
        return result;

    }

}
