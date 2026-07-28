class Solution {
    public boolean isPalindrome(String s) {
        char[] inputArray = s.toCharArray();
        char[] inputArrayCleaned = new char[inputArray.length];
        int j = 0;
        // clean the input
        for (int i = 0; i < inputArray.length; i++) {
            if (Character.isLetterOrDigit(inputArray[i])) { // remember that
                inputArrayCleaned[j] = Character.toLowerCase(inputArray[i]);
                j++;
            }
        }
        // check the new clean array with two pointers
        for (int i = 0, k = j - 1; i < k; i++, k--) {
            if (inputArrayCleaned[i] != inputArrayCleaned[k]) {
                System.out.println("Found chars that not match: index = " + i + " char: " + inputArrayCleaned[i] + " and index k = " + k + " char: " + inputArrayCleaned[k-1]);
                return false;
            }
        }
        return true;
    }
}
