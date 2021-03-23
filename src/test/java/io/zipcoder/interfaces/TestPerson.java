package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){

        String givenName = "uwu bean";
        long givenId = 1000;
        Person person = new Person(givenId, givenName);

        String retrievedName = person.getName();
        long retrievedId = person.getId();

        Assert.assertEquals(givenId, retrievedId);
        Assert.assertEquals(givenName, retrievedName);

    }

    @Test
    public void testSetName(){

        Person person = new Person(234, "aaa");
        String givenName = "bbb";
        person.setName(givenName);

        String retrievedName = person.getName();

        Assert.assertEquals(givenName, retrievedName);

    }


}