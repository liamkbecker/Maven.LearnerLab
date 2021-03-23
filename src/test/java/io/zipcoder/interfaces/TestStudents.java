package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test1(){
        Assert.assertEquals(Students.getInstance().getNameById(42), "Ryan");
    }

}
