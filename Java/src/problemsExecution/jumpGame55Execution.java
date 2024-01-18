package problemsExecution;

import execution.problemModel;
import jumpGame.jumpGame55;
import plusOne.plusOne66;

import java.util.Arrays;

public class jumpGame55Execution extends problemModel {
    public static void main(String[] args) {
        jumpGame55Execution execution = new jumpGame55Execution();
        execution.execute();
    }
    @Override
    public void execute() {
        jumpGame55 jumpGame = new jumpGame55();
        int[] digits = {2,3,1,1,4};
        System.out.println("Original digits array: " + Arrays.toString(digits));
        boolean result = jumpGame.canJump(digits);
        System.out.println("Result after plusOne66: " + result);
    }
}
