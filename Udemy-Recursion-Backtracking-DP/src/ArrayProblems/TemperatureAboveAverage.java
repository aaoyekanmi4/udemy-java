package ArrayProblems;
import Helpers.ConsoleIO;

public class TemperatureAboveAverage {
    private int length;
    private int[] temps;
    private int average;
    private ConsoleIO io;

    public TemperatureAboveAverage(int length) {
        this.length = length;
        this.temps = new int[length];
        this.io = new ConsoleIO();
    }

    public void runProgram() {
        for( int i = 0; i < this.temps.length; i++) {
            int enteredTemp = io.readInt(String.format("Day %s high temp: ", i + 1));
            this.temps[i] =enteredTemp;
        }
        System.out.printf("Average temp = %s%n", getAverageTemp());
        System.out.printf("Days above average : %s", findDaysAboveAverageTemp());
    }


    private double getAverageTemp() {
        int average = 0;
        for (int i = 0; i < temps.length; i++) {
            average += temps[i];
        }
        this.average =  average / temps.length;
        return this.average;
    }

    private int findDaysAboveAverageTemp() {
        int days = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > this.average) {
                days++;
            }
        }
        return days;
    }
}
