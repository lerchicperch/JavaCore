import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args){
        int[] inputArray = {1, 3, 4};
        int target = 5;
        System.out.println(Arrays.toString(twoSum(inputArray, target)));
    }

    //Return indices of the two numbers such that they add up to target.

    //O(n2) time complexity
    public static int[] badTwoSum(int[] nums, int target) {
        int[] outputArray = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < (nums.length); j++){
                if ((nums[i] + nums[j]) == target)
                {
                    outputArray[0] = i;
                    outputArray[1] = j;
                }
            }
        }
        return outputArray;
    }

    //O(n) time complexity
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
