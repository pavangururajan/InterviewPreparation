package com.test.google.graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author: pavan.g
 * created: 26/05/18.
 */
public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, Set<Integer>> requisiteMap = new HashMap<>();
        for (int i = 0; i < prerequisites.length; i++) {
            int course = prerequisites[i][0];
            int required = prerequisites[i][1];
            Integer parent = required;
            Set<Integer> currentRequisites;
            Set<Integer> newRequisites = new HashSet<>();
            newRequisites.add(parent);
            do {
                currentRequisites = newRequisites;
                newRequisites = new HashSet<>();
                for (Integer eachParent : currentRequisites) {
                    Set<Integer> eachRequisites = requisiteMap.get(eachParent);
                    if (eachRequisites == null) {
                        continue;
                    }
                    newRequisites.addAll(eachRequisites);
                }
            } while (!newRequisites.isEmpty() && !newRequisites.contains(course));
            if (!newRequisites.isEmpty()) {
                return false;
            }
            Set<Integer> requisites = requisiteMap.get(course);
            if (requisites == null) {
                requisites = new HashSet<>();
            }
            requisites.add(required);
            requisiteMap.put(course, requisites);
        }
        return true;
    }
}
