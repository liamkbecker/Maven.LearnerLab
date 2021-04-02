package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void test1(){
        Instructors i = new Instructors();
        Assert.assertEquals(i.getNameById(12), "Kris");
    }

    @Test
    public void test2(){
        Instructors i = new Instructors();
        Assert.assertEquals(i.getNameById(22), "Dolio");
    }

    @Test
    public void test3(){
        Instructors i = new Instructors();
        Assert.assertEquals(i.getNameById(32), "Nobles");
    }

}