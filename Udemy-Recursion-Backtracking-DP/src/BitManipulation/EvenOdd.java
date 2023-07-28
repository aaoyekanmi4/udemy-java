package BitManipulation;

public class EvenOdd {
    public void check(int num) {
        if ((num ^ 1) == num + 1){
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}
