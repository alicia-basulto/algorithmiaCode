package rotate;

public class rotate189 {
    public rotate189(){

    }
    public void rotate(int[] nums, int k) {
        k = k  %nums.length;

        rotateFun(nums,0,nums.length-1-k);
        rotateFun(nums,nums.length-k,nums.length-1);
        rotateFun(nums,0,nums.length-1);
    }

    static void rotateFun(int [] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }
    }
}
