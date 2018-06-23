package com.test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.zip.CheckedInputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Map<Integer, TestCase> testCaseRegistry = new TreeMap<Integer, TestCase>();
        Map<Integer, Set<TestCase>> testCaseBySize = new TreeMap<Integer, Set<TestCase>>();

        Scanner sc = new Scanner(System.in);
        int numberTestCases = sc.nextInt();
        int numberDependencies = sc.nextInt();

        for (int i = 0; i < numberTestCases; i++) {
            TestCase t = new TestCase(i);
            testCaseRegistry.put(i, t);
            t.setSuccess(sc.nextInt() != 0);
        }

        for (int i = 0; i < numberDependencies; i++) {
            TestCase t = testCaseRegistry.get(sc.nextInt());
            t.addDependency(testCaseRegistry.get(sc.nextInt()));
        }

        for (TestCase t : testCaseRegistry.values()) {
            Set<TestCase> testCaseSet = testCaseBySize.get(t.getDependencySize());
            if (testCaseSet == null) {
                testCaseSet = new HashSet<TestCase>();
                testCaseBySize.put(t.getDependencySize(), testCaseSet);
            }
            testCaseSet.add(t);
        }

        for (Set<TestCase> t : testCaseBySize.values()) {
            for (TestCase test: t) {
                boolean success = true;
                for (TestCase dependent : test.getDependencies()) {
                    success = dependent.isSuccess() && success;
                }
                test.setSuccess(success);
            }
        }
        for (TestCase t: testCaseRegistry.values()) {
            if (t.isSuccess()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    public static class TestCase {
        private int id;
        private boolean success = false;
        private Set<TestCase> dependencies;

        public TestCase(int id) {
            this.id = id;
            dependencies = new HashSet<TestCase>();
        }

        public Set<TestCase> getDependencies() {
            return dependencies;
        }

        public int getDependencySize() {
            return dependencies.size();
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public void addDependency(TestCase t) {
            dependencies.add(t);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof TestCase)) return false;

            TestCase testCase = (TestCase) o;

            return getId() == testCase.getId();

        }

        @Override
        public int hashCode() {
            return getId();
        }

    }

}
