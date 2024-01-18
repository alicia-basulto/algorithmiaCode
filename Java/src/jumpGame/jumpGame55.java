package jumpGame;

public class jumpGame55 {
    public jumpGame55() {
    }

    public boolean canJump(int[] nums) {
        int finalPosition = nums.length;
        int reachable = 0;
        for (int i = 0; i < finalPosition ; i ++){
            if(i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }

        return true;

    }
}
