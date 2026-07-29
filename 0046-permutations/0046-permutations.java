/*
1. Start
2. Check Input: If the array 'nums' is empty or null, return an empty list immediately.
3. Initialize Storage:
    Create an empty list 'result' to store all generated permutations.
    Create a boolean array 'visited' of the same length as 'nums' (initialized to false).
4. Call Recursive Helper (calcPermut): 
    Pass 'nums', 'result', 'visited', and an empty path list 'current'.
5. Check Base Case (inside calcPermut):
    If current.size() equals nums.length:
      Save a copy of 'current' into 'result'.
      Return to exit the current recursion level.
6. Loop Through Array (inside calcPermut):
    For each index i from 0 to nums.length - 1:
      If visited[i] is true: Skip this index and continue.
      Select Element: Mark visited[i] = true and append nums[i] to 'current'.
      Explore: Make a recursive call to calcPermut.
      Backtrack: Mark visited[i] = false and remove the last element from 'current'.
7. Display Output: 
    Return 'result'.
8. End
*/
class Solution {
    public List<List<Integer>> permute(int[] nums) {

        if (nums == null || nums.length == 0) {
            return new ArrayList();
        }

        List<List<Integer>> result = new ArrayList();
        boolean[] visited = new boolean[nums.length];
        calcPermut(nums, result, visited, new ArrayList<>());
        return result;
    }

    public void calcPermut(int[] nums, List<List<Integer>> result, boolean[] visited, List<Integer> current) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }

            visited[i] = true;
            current.add(nums[i]);
            calcPermut(nums, result, visited, current);
            visited[i] = false;
            current.remove(current.size() - 1);
        }
    }

}
