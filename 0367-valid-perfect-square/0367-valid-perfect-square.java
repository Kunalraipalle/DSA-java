class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 1, r = num / 2;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            long s = mid * mid;

            if (s == num)
                return true;
            else if (s > num)
                r = mid - 1;
            else
                l = mid + 1;
        }

        return num == 1;
    }
}