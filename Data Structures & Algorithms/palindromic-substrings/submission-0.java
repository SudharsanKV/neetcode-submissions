class Solution {
    public int countSubstrings(String s) {
        int ans = 0;
        for(int i=0; i < s.length(); i++){
            int currOddCount = expandFromCentre(s, i, i);
            int currEvenCount = expandFromCentre(s, i, i+1);
            ans += currOddCount + currEvenCount;
        }
        return ans;
    }

    public int expandFromCentre(String s, int left, int right){
        int sum = 0;
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            sum+=1;
            left--;
            right++;
        }
        return sum;
    }
}
