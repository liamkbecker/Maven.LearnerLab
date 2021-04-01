package io.zipcoder.interfaces;

public class Students extends People<Student>{

    private People<Student> INSTANCE = new People<Student>();

    Students(){
        Student ryan = new Student(42, "Ryan");
        Student justin = new Student(52, "Justin");
        Student theresa = new Student(62, "Theresa");
        Student hazel = new Student(72, "Hazel");

        INSTANCE.add(ryan);
        INSTANCE.add(justin);
        INSTANCE.add(theresa);
        INSTANCE.add(hazel);
    }

    public People<Student> getInstance(){
        return INSTANCE;
    }

    public String getNameById(long id){
        return INSTANCE.findById(id).getName();
    }

}
