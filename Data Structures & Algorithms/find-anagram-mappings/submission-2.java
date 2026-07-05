class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> indexMap1 = new HashMap<Integer, Integer>();

        int length = nums2.length; // nums1 and 2 length is equal
        for( int i = 0; i < length; i++) {
            indexMap1.put(nums2[i], i);
        }
        int [] aMap = new int[length];
        for( int i = 0; i < length; i++) {
            int indexOfItem = indexMap1.get(nums1[i]);
            aMap[i] = indexOfItem;
        }

        return aMap;
    }
}
