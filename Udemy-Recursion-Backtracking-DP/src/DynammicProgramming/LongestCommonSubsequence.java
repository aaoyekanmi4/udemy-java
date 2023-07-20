package DynammicProgramming;

public class LongestCommonSubsequence {
    private String result;
    private String str1;
    private String str2;
    private int[][] table;

    public LongestCommonSubsequence(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        this.table = new int[str1.length() +1][str2.length() +1];
        this.result = "";
    }

    public String solve()  {
        for (int i = 1; i <=str1.length(); i++) {
            for (int j = 1; j <=str2.length(); j++) {
                if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    table[i][j] = table[i-1][j-1] + 1;
                } else {
                    table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
                }
            }
        }
        int i = str1.length();
        int j = str2.length();
        while (i > 0 && j > 0) {
            if (str1.charAt(i-1) == str2.charAt(j-1)) {
                result += str1.charAt(i-1);
                // put them backwards
                i -=1;
                j -=1;
            } else if (table[i-1][j] > table[i][j-1]) {
                i -=1;
            } else {
                j -=1;
            }
        }
        return new StringBuilder(result).reverse().toString();
    }
}
