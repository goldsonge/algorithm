class Solution {
    public String solution(String a, String b) {
        java.math.BigInteger numA = new java.math.BigInteger(a);
        java.math.BigInteger numB = new java.math.BigInteger(b);
        
        return numA.add(numB).toString();
    }
}