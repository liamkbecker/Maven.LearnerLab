package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test1(){
        Students students = Students.getInstance();
        Assert.assertEquals(students.getNameById(42), "Ryan");
    }

    @Test
    public void test2(){
        Students students = Students.getInstance();
        Assert.assertEquals(students.getNameById(52), "Justin");
    }

    @Test
    public void test3(){
        Students students = Students.getInstance();
        Assert.assertEquals(students.getNameById(62), "Theresa");
    }

    @Test
    public void test4(){
        Students students = Students.getInstance();
        Assert.assertEquals(students.getNameById(72), "Hazel");
    }

}
