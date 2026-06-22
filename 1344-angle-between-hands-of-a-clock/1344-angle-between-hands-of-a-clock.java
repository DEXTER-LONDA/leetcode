class Solution {
    public double angleClock(int hour, int minutes) {
        int minDeg=6;
        int hrDeg=30;
        double hrExDeg=0.5;
        double degree=Math.abs((minutes*minDeg)-(hrDeg*hour)-(hrExDeg*minutes));
        double finalDeg=Math.min(degree,360-degree);
        return finalDeg;
    }
}