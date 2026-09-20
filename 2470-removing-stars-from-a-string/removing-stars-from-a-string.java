class Solution {
    public String removeStars(String s) {

        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch == '*') {
                ans.setLength(ans.length() - 1);
            } else {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}