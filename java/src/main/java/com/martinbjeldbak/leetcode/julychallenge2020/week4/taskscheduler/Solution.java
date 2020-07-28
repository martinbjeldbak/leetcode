package com.martinbjeldbak.leetcode.julychallenge2020.week4.taskscheduler;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/547/week-4-july-22nd-july-28th/3404/
class Solution {
    public int leastInterval(char[] tasks, int n) {
        List<Character> chars = new ArrayList<>(tasks.length);

        for(int i = 0; i < tasks.length; i++) {
            chars.add(tasks[i]);
        }

        List<Character> answer = interval(chars, n);
        System.out.println(answer);

        return answer.size();
    }

    private static List<Character> interval(List<Character> tasksLeft, int n) {
        List<Character> newTasksLeft = new ArrayList<>(tasksLeft.size());
        newTasksLeft.addAll(tasksLeft);
        List<Character> sequence = new ArrayList<>(tasksLeft.size());

        for(int i = 0; i < tasksLeft.size(); i++) {
            if(allowedIn(tasksLeft.get(i), sequence, n)) {
                sequence.add(tasksLeft.get(i));
                newTasksLeft.remove(tasksLeft.get(i));
            }
            else if(!allowedIn(tasksLeft.get(i), sequence, n) && i == tasksLeft.size()-1) {
                sequence.add(null);
            }
        }

        if(tasksLeft.size() > 0) {
            sequence.addAll(interval(newTasksLeft, n));
        }

        return sequence;
    }

    private static boolean allowedIn(char task, List<Character> sequence, int n) {
        int startIndex = sequence.size() -n;

        if(startIndex < 0) {
            startIndex = 0;
        }
2
        return !sequence.subList(startIndex, sequence.size()).contains(task);
    }
}
