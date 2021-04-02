package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    Students students = new Students();
    Instructors instructors = new Instructors();

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getInstance(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){

    }

}
