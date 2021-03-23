package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    public double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
        this.totalStudyTime = 0;
    }

    public void learn(double numberOfHours) {
        totalStudyTime = totalStudyTime + numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

}
