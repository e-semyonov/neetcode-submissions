class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] result = new int[2];
        // brute force
        int aSize = numbers.length;
        int l = 0;
        int r = aSize - 1;

        while(l < r) {

            if (numbers[l] + numbers[r] == target) {
                result[0] = l+1;
                result[1] = r+1;
                break;
            } else if( numbers[l] + numbers[r] > target) {
                r--;
                
            } else if(numbers[l] + numbers[r] < target) {
                l++;
            }
        }
        return result;
    }
}
