package InterviewQuestions;

public class ReverseInteger {
    public int reverseInt(int num) {
        if (num < 10 && num >=0) {
            return num;
        }
        int remainder = 0;
        int reversed = 0;
        while (num > 0) {
            remainder =  num % 10;
            num = num /10;
            reversed = reversed * 10 + remainder;
        }
            return reversed;
        }
}
