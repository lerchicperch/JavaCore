public class Task1 {

    public static void main(String[] args){
        int[] inputArray = {1};
        System.out.println(findMaxConsecutiveOnes(inputArray));
    }

    //Find the maximum number of consecutive 1's in the array.
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                if (maxCount < count) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}
