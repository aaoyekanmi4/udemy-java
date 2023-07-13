package Recursion;

public class Recursion {
    public void head(int n) {
        //takes twice as long as iterative, calling then returning them all
        System.out.println("Calling the function with n="+n);
        if (n==0) return;
        // call the method recursively
        head(n-1);
        // do some operation
        System.out.println("The value of n="+n);
    }

    public void tail(int n) {
        System.out.println("Calling the function with n="+n);
        if (n==0) return;
        // do some operation
        System.out.println("The value of n="+n);
        //call the method recursively
        tail(n-1);
    }
}
