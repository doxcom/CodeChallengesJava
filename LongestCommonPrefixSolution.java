import java.util.Arrays;

public class LongestCommonPrefixSolution {

    public static void main(String[] args) {

        LongestCommonPrefixSolution lcp = new LongestCommonPrefixSolution();
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(lcp.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {

        int cn=0;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < strs.length; i++) {
           int len=strs[i].length();

            for (int j = 0; j < len; j++) {
                if(strs[i].charAt(j) == strs[i-1].charAt(j)) {
                    sb.append(strs[i].charAt(j));// flofl
                    if(i<=strs.length){
                        cn++;
                    }
                }
            }



        }
        if(cn==0){
            return "";
        }else{

            return String.valueOf(sb);
        }





    }

}
