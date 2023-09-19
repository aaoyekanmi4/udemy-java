package MasterMind;
import Backtracking.Permutations;
import Helpers.ConsoleIO;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FourNumberGame {
    private List<Integer> code;
    private int tries = 5;
    private int currentTry = 1;
    private boolean gameOver;
    private ConsoleIO io;

    private void init() {
        Permutations permute = new Permutations();
        List<List<Integer>> permutations = permute.solve(new int[]{1,2,3,4});
        Random rand = new Random();
        int randomIdx = rand.nextInt(permutations.size());
        this.code = permutations.get(randomIdx);
        this.io = new ConsoleIO();

    }

    private int[] convertGuessToInt(String guessInput) {
        int[] result = new int[4];
        String[] guessArray = guessInput.split(",");
        for (int i = 0; i < guessArray.length; i++) {
            result[i] = Integer.parseInt(guessArray[i]);
        }
        return result;
    }

    private int checkGuess(int[] guess) {
        int rightlyPlaced = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == code.get(i)) {
                rightlyPlaced++;
            }
        }
        return rightlyPlaced;
    }
    private void makeGuess () {
        System.out.println("Attempt number " + currentTry);
        String guessInput = io.readRequiredString("Enter numbers 1-4 in any order separated by commas\n");
        int[] guess = convertGuessToInt(guessInput);
        int numberRightlyPlaced = checkGuess(guess);
        if (numberRightlyPlaced == 4) {
            System.out.println("You won!");
            System.out.println(Arrays.toString(code.toArray()) + " was the code!");
            gameOver = true;
        } else {
            System.out.printf("%s number%s in the right place. Try again. %n", numberRightlyPlaced,
                    numberRightlyPlaced == 1 ? "" : "s");
            tries--;
            currentTry++;
        }
    }

    public void runGame() {
        init();
        while (tries > 0 && !gameOver) {
            makeGuess();
        }
        if (tries == 0) {
            System.out.println(Arrays.toString(code.toArray()) + " was the code!");
            System.out.println("Better luck next time!");
        }
    }
}
