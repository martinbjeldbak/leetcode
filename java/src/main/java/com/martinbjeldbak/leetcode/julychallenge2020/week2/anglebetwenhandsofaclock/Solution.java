package com.martinbjeldbak.leetcode.julychallenge2020.week2.anglebetwenhandsofaclock;

// https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/545/week-2-july-8th-july-14th/3390/
class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour == 12)
            hour = 0;

        int angleMinute = minutes * 6;
        double minutePercentage = 1 / (360 / (double)angleMinute);
        double angleHour = hour * 30 + (30 * minutePercentage);


        return Math.abs(angleMinute - angleHour);
    }
}