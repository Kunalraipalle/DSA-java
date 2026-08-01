class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        calcomb(n, k, 1, res, new ArrayList<>());
        return res;
    }

    private void calcomb(int n, int k, int start, List<List<Integer>> res, List<Integer> current) {

        if (current.size() == k) {
            res.add(new ArrayList<>(current));
            return;
        }
        int need = k -current.size();
        for (int i = start; i <= n - need + 1; i++) {
            current.add(i);
            calcomb(n, k, i + 1, res, current);
            current.remove(current.size() - 1);
        }
    }
}
