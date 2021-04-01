package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test1(){
        Students s = new Students();
        Assert.assertEquals(s.getNameById(42), "Ryan");
    }

    @Test
    public void test2(){
        Students s = new Students();
        Assert.assertEquals(s.getNameById(52), "Justin");
    }

    @Test
    public void test3(){
        Students s = new Students();
        Assert.assertEquals(s.getNameById(62), "Theresa");
    }

    @Test
    public void test4(){
        Students s = new Students();
        Assert.assertEquals(s.getNameById(72), "Hazel");
    }

}
