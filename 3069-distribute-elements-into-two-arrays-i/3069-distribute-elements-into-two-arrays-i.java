class Solution {
    public int[] resultArray(int[] nums) {

        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (i == 0) {
                arr1.add(nums[i]);
            } 
            else if (i == 1) {
                arr2.add(nums[i]);
            } 
            else {
                if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                    arr1.add(nums[i]);
                } 
                else {
                    arr2.add(nums[i]);
                }
            }
        }

        int[] ans = new int[nums.length];
        int k = 0;

        for (int x : arr1)
            ans[k++] = x;

        for (int x : arr2)
            ans[k++] = x;

        return ans;
    }
}