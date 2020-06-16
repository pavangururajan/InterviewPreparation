package com.test.facebook;

public class ClockAnge {
    public double angleClock(int hour, int minutes) {
        double shortAngle = 0.5;
        double longAngle = 6;

        hour = hour % 12;
        minutes = minutes % 60;

        int totalMinutes = hour * 60 + minutes;

        double minuteAngle = minutes * longAngle;
        double hourAngle = totalMinutes * shortAngle;
        double angleDiff = Math.max(minuteAngle, hourAngle) - Math.min(minuteAngle, hourAngle);
        angleDiff = Math.min(angleDiff, 360-angleDiff);
        return angleDiff;
    }
}
