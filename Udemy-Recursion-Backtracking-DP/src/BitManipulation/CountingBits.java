package BitManipulation;

public class CountingBits {
    public void countBits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num >> 1; //right shifting by 1 divides by 2 (loses right most bit digit)
        }
        System.out.println(count);
    }
}
