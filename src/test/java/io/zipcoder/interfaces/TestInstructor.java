package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(345, "rinny");
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(345, "rinny");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(345, "rinny");
        Student student = new Student(123, "hazey");
        double givenHours = 9.0;

        instructor.teach(student, givenHours);
        double retrievedHours = student.getTotalStudyTime();

        Assert.assertEquals(givenHours, retrievedHours, 0.0001);
    }

    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(345, "rinny");
        Student student1 = new Student(123, "hazey");
        Student student2 = new Student(456, "dazey");
        Student student3 = new Student(789, "mazey");
        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        double givenHours = 9.0;

        instructor.lecture(students, givenHours);
        double retrievedHours1 = student1.getTotalStudyTime();
        double retrievedHours2 = student2.getTotalStudyTime();
        double retrievedHours3 = student3.getTotalStudyTime();

        Assert.assertEquals(3.0, retrievedHours1, 0.0001);
        Assert.assertEquals(3.0, retrievedHours2, 0.0001);
        Assert.assertEquals(3.0, retrievedHours3, 0.0001);
    }

    /*
    Create a TestInstructor class.
Create a testImplementation method that asserts that an Instructor is an instanceof a Teacher.
Create a testInheritance method that asserts that a Instructor is an instanceof a Person.
Create a testTeach method that ensures when an Instructor invokes the teach method, a respective student's totalStudyTime instance variable is incremented by the specified numberOfHours.
Create a testLecture method that ensures when an Instructor invokes the lecture method, a respective array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.
     */

}
