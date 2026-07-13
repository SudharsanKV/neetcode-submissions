class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> resultMap = new HashMap<>();
        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            resultMap.putIfAbsent(sortedStr, new ArrayList<>());
            resultMap.get(sortedStr).add(str);
        }
        return new ArrayList<>(resultMap.values());
        
    }
}
