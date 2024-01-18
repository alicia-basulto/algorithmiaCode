package problemsExecution;

import execution.problemModel;
import maxProfit.maxProfit121;
import plusOne.plusOne66;

import java.util.Arrays;

public class maxProfit121Execution extends problemModel {
    public static void main(String[] args) {
        maxProfit121Execution execution = new maxProfit121Execution();
        execution.execute();
    }
    @Override
    public void execute() {
        maxProfit121 maxProfit = new maxProfit121();
        int[] digits = {7,1,5,3,6,4};
        System.out.println("Original digits array: " + Arrays.toString(digits));
        int result = maxProfit.maxProfit(digits);
        System.out.println("Result after plusOne66: " + result);
    }
}
