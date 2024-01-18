package problemsExecution;

import execution.problemModel;
import plusOne.plusOne66;

import java.util.Arrays;

public class plusOne66Execution extends problemModel {
    public static void main(String[] args) {
        plusOne66Execution execution = new plusOne66Execution();
        execution.execute();
    }
    @Override
    public void execute() {
        plusOne66 plusOne = new plusOne66();
        int[] digits = {1, 2, 3};
        System.out.println("Original digits array: " + Arrays.toString(digits));
        int[] result = plusOne.plusOne(digits);
        System.out.println("Result after plusOne66: " + Arrays.toString(result));
    }
}
