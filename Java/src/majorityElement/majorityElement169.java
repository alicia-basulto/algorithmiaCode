package majorityElement;

import execution.problemModel;

import java.util.HashMap;
import java.util.Map;

public class majorityElement169 {
    public majorityElement169(){

    }
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int record = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int majority = n / 2;

        for (int num: nums){
            map.put(num, map.getOrDefault(num, 0) +1);
            if(map.get(num) > majority ){
                record = num;
            }
        }
        return record;
    }
}
