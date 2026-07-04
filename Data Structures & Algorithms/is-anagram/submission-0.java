class Solution {
    public boolean isAnagram(String s, String t) {
        // String lenght check
        if(s.length() != t.length()){
            return false;
        }
        List<Character> scharList = new ArrayList<>();
        List<Character> tcharList = new ArrayList<>();
        for(char i : s.toCharArray()){
            scharList.add(i);
        }
        for(char i : t.toCharArray()){
            tcharList.add(i);
        }
        Collections.sort(scharList);
        Collections.sort(tcharList);

        return scharList.equals(tcharList);

        // System.out.println("" + scharList);

    // return false;

    }
}
