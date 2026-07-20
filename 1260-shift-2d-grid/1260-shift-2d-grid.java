class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
         int m = grid.length;
        int n = grid[0].length;
        int totalElements = m * n;
        int rot = k % totalElements;
        
        
        if (rot == 0) {
            return Arrays.stream(grid)
                .map(row -> Arrays.stream(row).boxed().collect(Collectors.toList()))
                .collect(Collectors.toList());
        }

      
         int[][] temp = new int[m][n];   
       for (int i = 0; i < totalElements; i++) {
        
            int oldRow = i / n;
            int oldCol = i % n;
            int newIndex = (i + rot) % totalElements;
            int newRow = newIndex / n;
            int newCol = newIndex % n;
            
           
            temp[newRow][newCol] = grid[oldRow][oldCol];
        }
     

       return Arrays.stream(temp)
            .map(row -> Arrays.stream(row).boxed().collect(Collectors.toList()))
            .collect(Collectors.toList());
    }
}