class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> value;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                value = map.get(nums[i]);
                for (int index : value) {
                    if (Math.abs(i - index) <= k)
                        return true;
                }
                value.add(i);
            } else {
                value = new ArrayList<>();
                value.add(i);

                map.put(nums[i], value);
            }
        }
        return false;
    }
}