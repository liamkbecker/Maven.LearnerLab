package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{

    private People<Instructor> INSTANCE = new People<Instructor>();

    Instructors(){
        Instructor kris = new Instructor(12, "Kris");
        Instructor dolio = new Instructor(22, "Dolio");
        Instructor nobles = new Instructor(32, "Nobles");

        INSTANCE.add(kris);
        INSTANCE.add(dolio);
        INSTANCE.add(nobles);
    }

    public People<Instructor> getInstance(){
        return INSTANCE;
    }

    public String getNameById(long id){
        return INSTANCE.findById(id).getName();
    }

}
