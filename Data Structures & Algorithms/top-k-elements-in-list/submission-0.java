

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Put map entries into a list
        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        // Sort by frequency descending
        list.sort((a, b) -> b.getValue() - a.getValue());

        // Store top k elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}