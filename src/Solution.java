
public class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder strBuilder = new StringBuilder();
        int idx = 0;
        while (idx < word1.length() || idx < word2.length()) {
            if (idx < word1.length()) strBuilder.append(word1.charAt(idx));
            if (idx < word2.length()) strBuilder.append(word2.charAt(idx));
            idx += 1;
        }
        return strBuilder.toString();
    }

    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while (j >= 0) {
            if (i < 0 || nums1[i] < nums2[j]) {
                nums1[a] = nums2[j];
                j--;
                a--;
            } else {
                nums1[a] = nums1[i];
                i--;
                a--;
            }
        }
    }
}



