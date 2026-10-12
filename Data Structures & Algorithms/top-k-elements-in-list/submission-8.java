class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int bucketSize = nums.length;

        int[] result = new int[k];
        List<Integer>[] bucket = new List[bucketSize + 1];

        //bucket key = frequency
        // bucket value = map of number and its frequency
        HashMap<Integer, Integer> frequencyToIndexMap = new HashMap<>();

        for (int i : nums) {
            frequencyToIndexMap.put(i, frequencyToIndexMap.getOrDefault(i, 0) + 1);
        }


        for (Map.Entry<Integer, Integer> numToFrequency : frequencyToIndexMap.entrySet()) {

            int num = numToFrequency.getKey();
            int frequency = numToFrequency.getValue();

            if (bucket[frequency] == null) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(num);
                bucket[frequency] = list;
            } else {
                bucket[frequency].add(num);
            }
        }

        for (int i = bucketSize; k > 0 && i >= 0; i--) {

            if(bucket[i] != null) {
                List<Integer> bucketAtI = bucket[i];
                for(Integer num : bucketAtI) {
                    result[k - 1] = num;
                    k--;
                }

            }
        }

        return result;
    }
}
