class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;// first index
        int j = 1;// index for deduplication
        int unique = 1;

        int asize = nums.length;
        
        if (asize == 1) {
            return unique;
        }

        while (j < asize){
            
            if(nums[i] == nums[j]){
                j++;
            } else if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
                j++;
                unique++;
            }
        }

    return unique;

        
    }
}