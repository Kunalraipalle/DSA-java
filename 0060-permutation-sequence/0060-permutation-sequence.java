class Solution {
    public String getPermutation(int n, int k) {
        int[] nums=new int[n];
       

        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }

       
         List<List<Integer>> permutations= permute(nums);

         List<Integer> result = permutations.get(k-1);
          StringBuilder sb = new StringBuilder();
         for (int num : result) {
                sb.append(num);
         }

         return sb.toString();
        
    }

    private List<List<Integer>> permute(int[] nums) {

        if (nums == null || nums.length == 0) {
            return new ArrayList();
        }

        List<List<Integer>> result = new ArrayList();
        boolean[] visited = new boolean[nums.length];
        calcPermut(nums, result, visited, new ArrayList<>());
        return result;
    }

    private void calcPermut(int[] nums, List<List<Integer>> result, boolean[] visited, List<Integer> current) {
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

