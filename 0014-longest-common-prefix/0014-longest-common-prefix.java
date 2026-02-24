class Solution {
    public String longestCommonPrefix(String[] strs) {
        String strPrefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while(!strs[i].startsWith(strPrefix)) {
                strPrefix = strPrefix.substring(0, strPrefix.length() - 1);
            }
        }

        return strPrefix;
    }
}