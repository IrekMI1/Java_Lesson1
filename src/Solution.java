
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

    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();
        int end = s.length() - 1;
        while (end >= 0) {
            if (s.charAt(end) == ' ') {
                end--;
                continue;
            }
            int start = end - 1;
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }
            sb.append(' ');
            sb.append(s.substring(start + 1, end + 1));
            end = start - 1;
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (!Character.isLetterOrDigit(s.charAt(left)) && left < right) {
                left++;
            }
            while (!Character.isLetterOrDigit(s.charAt(right)) && right > left) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) {
                right--;
                left++;
            }
            else {
                return false;
            }
        }
        return true;
    }
}



