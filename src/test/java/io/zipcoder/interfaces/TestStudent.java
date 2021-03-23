package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student(234, "hazey");
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student student = new Student(567, "dazey");
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){

        Student student = new Student(901, "mazey");
        double givenHours = 9.5;

        student.learn(givenHours);
        double retrievedHours = student.getTotalStudyTime();

        Assert.assertEquals(givenHours, retrievedHours, 0.00001);

    }

}
