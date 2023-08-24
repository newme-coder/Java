import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /* solution1 brute force 
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    */
    
    /* solution2 two-pass hash table 
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        //build hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }
        //find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }
        return new int[]{};//no solution found, return black array;
    }
    */

     public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i]; 
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("please provide some integers as command line arguments");
            return;
        }
        int[] nums = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        int target = 3;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}