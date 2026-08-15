class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) 
    {
        List<Integer> sol=new ArrayList<>();
        helper(height,threshold,1,sol);
        return sol;
        
    }
    private void helper(int[] h,int t ,int i, List<Integer> sol){
        if(i==h.length){
            return;
        }
        if(h[i-1]>t){
            sol.add(i);

        }
        helper(h, t, i + 1, sol);

    }
}