class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> resultMap = new HashMap<>();
        for(String str : strs){
            char[] stArr = str.toCharArray();
            Arrays.sort(stArr);
            String sortedStr = new String(stArr);

            resultMap.putIfAbsent(sortedStr, new ArrayList<>());
            resultMap.get(sortedStr).add(str);
        }
        return new ArrayList<>(resultMap.values());

    }
}
