package com.test.facebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxStudentsExamTest {

    @Test
    public void maxStudents() {
        MaxStudentsExam maxStudentsExam = new MaxStudentsExam();
        char[][] seats = new char[][]{{'#','.','.','.','#'},
                {'.','#','.','#','.'},
                {'.','.','#','.','.'},
                {'.','#','.','#','.'},
                {'#','.','.','.','#'}};
        System.out.println(maxStudentsExam.maxStudents(seats));
    }
}