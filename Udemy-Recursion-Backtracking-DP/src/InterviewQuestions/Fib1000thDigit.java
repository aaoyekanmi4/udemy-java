package InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fib1000thDigit {
    public int fibTab() {

        int num2 = 1;
        int num1 = 1;
        int i = 1;
        while(Integer.toString(i).length() < 1000) {
            num1 = num2;
            num2 = num1 + num2;
            i++;
        }
        return i;
    }
}

