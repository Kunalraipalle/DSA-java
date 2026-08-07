//G = n ^ (n >> 1)
//G = n ^ (n / 2)
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        //Every integer is in the inclusive range [0, 2n - 1]
       int inclusive_range = (int) Math.pow(2, n);
        
        for (int i = 0; i < inclusive_range; i++) {
            list.add(i ^ (i / 2));
        }
        return list;
    }
}