package Recursion;

public class TowersOfHanoi {
    /*
    * disks represented by int starting with 0
    * 0: smallest disk
    * n: largest disk
    *
    * the three rods are source, middle, and destination
    *
    * only a single disk can be moved at a time
    * each move is taking upper disk from one rod and moving it to another
    * a larger disk cannot be placed on a smaller one
    *
    * */
    public void solve(int disk, char source, char middle, char destination) {
        if (disk == 0) {
            System.out.println("Plate " + disk + " from " + source + " to " + destination);
            return;
        }
        //we move n-1 plates from source to middle rod so that we can move largest to destination
        solve(disk -1,source, destination, middle);
        // we move the largest plate to the destination;
        // because we are calling recursively the disk below will not always be the largest
        System.out.println("Plate " + disk + " from " + source + " to " + destination);
        solve(disk -1,middle, source, destination);
    }
}
