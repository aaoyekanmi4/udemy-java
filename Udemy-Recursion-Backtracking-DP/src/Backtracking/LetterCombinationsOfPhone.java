package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhone {

    private String[] digitToChars = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz" };

    public List<String> getCombos(String digits) {
        List<String> combos = new ArrayList<>();
        backtrack(digits,0, "", combos);
        return combos;
    }

    private void backtrack(String digits, int idx, String current, List<String> combos) {
        //base case: we have made a combo the same length as the starting digits
        // so add to answer
        if (current.length() == digits.length()) {
            combos.add(current);
            return;
        }

        // turn the char at current idx of digit string into an int with - '0'
        int letterMappingIdx = digits.charAt(idx) - '0';
        // change string of letters at that idx into an array to use foreach
        String[] lettersForNumber = digitToChars[letterMappingIdx].split("");

        // for each letter ex "abc" run the following
        // by
        for (String letter: lettersForNumber) {
            backtrack(digits, idx + 1, current + letter, combos);
        }
    }
}
