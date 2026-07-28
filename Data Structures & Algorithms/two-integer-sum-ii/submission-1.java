class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] result = new int[2];
        // brute force
        int aSize = numbers.length;

        for (int i = 0; i < aSize; i ++) {
            for(int j = i + 1; j < aSize; j++){
                if(numbers[i] + numbers[j] == target) {
                    result[0] = i+1;
                    result[1] = j+1;
                    break;
                }
            }
        }
        return result;
    }
}
