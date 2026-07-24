class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int cur = 0, waterblock = 0, highpoll = 0, blblock = 0, poll = 1, trap = 0;
        int maxIndex = 0;

        // Step 1: Find the true highest pillar peak
        for (int i = 0; i < height.length; i++) {
            if (height[i] > highpoll) {
                highpoll = height[i];
                maxIndex = i;
            }
        }
        highpoll = 0; 
        for (int i = 0; i <= maxIndex; i++) {
            cur = height[i];
            
            if (cur >= highpoll) { 
                
                trap = trap + waterblock;
                highpoll = cur; 
                waterblock = 0;
            } 
            else if (highpoll > cur) { 
               
                waterblock = waterblock + (highpoll - cur);
            }
        }

        highpoll = 0; 
        waterblock = 0;
        for (int i = height.length - 1; i >= maxIndex; i--) {
            cur = height[i];
            
            if (cur >= highpoll) {
                trap = trap + waterblock;
                highpoll = cur;
                waterblock = 0;
            } 
            else if (highpoll > cur) {
                waterblock = waterblock + (highpoll - cur);
            }
        }

        return trap;
    }
}
