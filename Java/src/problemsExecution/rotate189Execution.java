package problemsExecution;

import execution.problemModel;
import majorityElement.majorityElement169;
import rotate.rotate189;

import java.util.Arrays;

public class rotate189Execution extends problemModel {
    public static void main(String[] args) {
        rotate189Execution execution = new rotate189Execution();
        execution.execute();
    }
    @Override
    public void execute() {
        rotate189 rotate = new rotate189();
        int k = 3;
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println("Original digits array: " + Arrays.toString(nums));
        rotate.rotate(nums,k);
        System.out.println("Result after plusOne66: " + Arrays.toString(nums));
    }
}
