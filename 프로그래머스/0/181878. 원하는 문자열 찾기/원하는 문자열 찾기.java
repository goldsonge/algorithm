class Solution {
    public int solution(String myString, String pat) {
        String myStringUnder = myString.toLowerCase(); 
        String patUnder = pat.toLowerCase();         
        if (myStringUnder.contains(patUnder)) {        
            return 1;
        } else {
            return 0;
        }
    }
}
