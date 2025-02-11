class Solution {
    public String solution(String myString, String pat) {
        int pos = myString.lastIndexOf(pat);
        if (pos == -1) {
            return "";
        }
        return myString.substring(0, pos + pat.length());
    }
}