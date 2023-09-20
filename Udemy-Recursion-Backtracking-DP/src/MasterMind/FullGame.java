package MasterMind;

import Helpers.ConsoleIO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FullGame {
    private List<Integer> code = new ArrayList<>();
    private int tries = 10;
    private int currentTry = 1;
    private boolean gameOver;
    private ConsoleIO io = new ConsoleIO();

    private void makeCode() {
        int[] options = new int[] {1,2,3,4,5,6};
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIdx = rand.nextInt(6);
            code.add(options[randomIdx]);
        }
    }

    private int[] convertGuessToInt(String guessInput) {
        int[] result = new int[4];
        String[] guessArray = guessInput.split("");
        for (int i = 0; i < guessArray.length; i++) {
            result[i] = Integer.parseInt(guessArray[i].trim());
        }
        return result;
    }

    private int checkNumbers(int[] guess) {
        List<Integer> codeCopy = new ArrayList<>(code);
        int numbersRight = 0;
        for (int i = 0; i < guess.length; i++) {
            if (codeCopy.contains(guess[i])) {
                codeCopy.remove(Integer.valueOf(guess[i]));
                numbersRight++;
            }
        }
        return numbersRight;
    }

    private int checkPlacement(int[] guess) {
        int rightlyPlaced = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == code.get(i)) {
                rightlyPlaced++;
            }
        }
        return rightlyPlaced;
    }

    private void makeGuess () {
        System.out.println("Attempt number: " + currentTry);
        String guessInput = io.readRequiredString("Enter 4 numbers (range 1-6) " +
                "in any order" +
                "\nDuplicates possible.\n");
        int[] guess = convertGuessToInt(guessInput);
        int numberRightlyPlaced = checkPlacement(guess);
        int numbersRight = checkNumbers(guess);
        if (numberRightlyPlaced == 4) {
            System.out.println("You won!");
            System.out.println(Arrays.toString(code.toArray()) + " was the code!");
            gameOver = true;
        } else {
            if (numberRightlyPlaced > 0) {
                System.out.printf("%s number%s correct and in the right place.%n", numberRightlyPlaced,
                        numberRightlyPlaced == 1 ? "" : "s");
            }
            if (numbersRight - numberRightlyPlaced > 0) {
                System.out.printf("%s number%s correct but in wrong place. Try again.%n",
                        numbersRight - numberRightlyPlaced,
                        numbersRight - numberRightlyPlaced == 1 ? "" : "s");
            }
            tries--;
            currentTry++;
        }
    }

   public void runGame() {
        makeCode();
       while (tries > 0 && !gameOver) {
           makeGuess();
       }
       if (tries == 0) {
           System.out.println(Arrays.toString(code.toArray()) + " was the code!");
           System.out.println("Better luck next time!");
       }
   }
}


