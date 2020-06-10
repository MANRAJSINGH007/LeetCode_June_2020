class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        if(n == 0) return true;
        int m = t.length();
        if(n > m) return false;
        int i = 0, j = 0;
        while(j < m){
            if(t.charAt(j) == s.charAt(i)) i ++;
            if(i == n) return true;
            j ++;
        }
        return false;
    }
}
