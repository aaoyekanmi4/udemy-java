package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class IsPrime {
    private boolean isPrime(int num){
        if (num == 1 || num == 0) {
            return false;
        }
        for (int i = num-1; i > 1; i--) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> collectPrimes(List<Integer> nums) {
        List<Integer> primes = new ArrayList<>();
        for (Integer num : nums) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        return primes;
    }
}
