package io.zipcoder.interfaces;

public final class Students extends People{

    final static Students INSTANCE = new Students();

    private Students(){
        Person ryan = new Person(42, "Ryan");
        Person justin = new Person(52, "Justin");
        Person theresa = new Person(62, "Theresa");
        Person hazel = new Person(72, "Hazel");

        INSTANCE.add(ryan);
        INSTANCE.add(justin);
        INSTANCE.add(theresa);
        INSTANCE.add(hazel);
    }

    public static Students getInstance(){
        return INSTANCE;
    }

}
