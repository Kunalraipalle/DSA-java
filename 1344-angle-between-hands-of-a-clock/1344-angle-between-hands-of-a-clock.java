class Solution {
    public double angleClock(int hour, int minutes) {
        /*
          Angle = Absolute Value of (30 times Hours - 5.5 times Minutes)
          If the answer is greater than 180 subtract it from 360.
        */
        double angle = Math.abs(30 * hour - 5.5 * minutes);
        if (angle > 180) {
            angle = 360 - angle;
        }
        return angle;

    }
}