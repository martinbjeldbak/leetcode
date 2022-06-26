package com.martinbjeldbak.leetcode.julychallenge2020.week2.anglebetwenhandsofaclock;

// https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/545/week-2-july-8th-july-14th/3390/
class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour == 12)
            hour = 0;

        // For every minute, we have 6 degrees of rotation on the clock (360/60)
        int angleMinute = minutes * 6;

        // Calculate how many percent the minute is through the clock (e.g. 30 mins is 50% through)
        double minutePercentage = 1 / (360 / (double)angleMinute);

        // For every hour, we have 30 degrees of rotation (360/12)
        double angleHour = hour * 30;

        // Add the percentage offset to the hour hand between the hours
        angleHour = angleHour + (30 * minutePercentage);

        double angleDifference = Math.abs(angleMinute - angleHour);

        if(angleDifference > 180)
            angleDifference = 360 - angleDifference;

        return angleDifference;
    }
}