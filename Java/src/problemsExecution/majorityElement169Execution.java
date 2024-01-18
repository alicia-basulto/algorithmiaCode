package problemsExecution;

import execution.problemModel;
import majorityElement.majorityElement169;
import plusOne.plusOne66;

import java.util.Arrays;

public class majorityElement169Execution extends problemModel {
    public static void main(String[] args) {
        majorityElement169Execution execution = new majorityElement169Execution();
        execution.execute();
    }
    @Override
    public void execute() {
        majorityElement169 majorityElement = new majorityElement169();
        int[] nums = {3, 2, 3};
        System.out.println("Original digits array: " + Arrays.toString(nums));
        int result = majorityElement.majorityElement(nums);
        System.out.println("Result after plusOne66: " + result);
    }
}
