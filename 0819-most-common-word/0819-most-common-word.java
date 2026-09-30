class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> hm = new HashMap<>();
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        String[] words = paragraph.toLowerCase().replaceAll("[^a-z]", " ").split("\\s+");
        String mostCommon = " ";
        int maxCount = 0;

        for (String word : words) {
            if (!word.isEmpty() && !bannedSet.contains(word)) {
                int currentCount = hm.getOrDefault(word, 0) + 1;
                hm.put(word, currentCount);
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mostCommon = word;
                }
            }
        }
        return mostCommon;

    }
}