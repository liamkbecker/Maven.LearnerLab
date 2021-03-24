package io.zipcoder.interfaces;

public final class Students extends People<Student>{

    static final Students INSTANCE = new Students();

    private Students(){
        Student ryan = new Student(42, "Ryan");
        Student justin = new Student(52, "Justin");
        Student theresa = new Student(62, "Theresa");
        Student hazel = new Student(72, "Hazel");

        INSTANCE.add(ryan);
        INSTANCE.add(justin);
        INSTANCE.add(theresa);
        INSTANCE.add(hazel);
    }

    public static Students getInstance(){
        return INSTANCE;
    }

}
