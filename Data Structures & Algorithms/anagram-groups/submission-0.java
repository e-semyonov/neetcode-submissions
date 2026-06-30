    class Solution {

        public List<List<String>> groupAnagrams(String[] strs) {



            return groupAnagram1(strs);
        }



        // 1 using sorting to use equals on strings.
        public List<List<String>> groupAnagram1(String[] strs) {

            HashMap<String, List<String>> sortedStringToList = new HashMap<String, List<String>>();
            for (String str : strs) {

                char[] charArrStr = str.toCharArray();
                Arrays.sort(charArrStr);
                sortedStringToList.putIfAbsent(new String(charArrStr), new ArrayList<>());
                List<String> groupedStrings = sortedStringToList.get(new String(charArrStr));
                groupedStrings.add(str);
            }
            return new ArrayList<>(sortedStringToList.values());
        }
    }
