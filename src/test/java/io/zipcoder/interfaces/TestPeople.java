package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd(){

        People people = new People();
        Person person1 = new Person(1, "Hazel");
        Person person2 = new Person(2, "Mazel");
        Person person3 = new Person(3, "Dazel");

        people.add(person1);
        people.add(person2);
        people.add(person3);

        Assert.assertTrue(people.contains(person1));
        Assert.assertTrue(people.contains(person2));
        Assert.assertTrue(people.contains(person3));

    }

    @Test
    public void testRemove(){

        People people = new People();
        Person person1 = new Person(1, "Hazel");
        Person person2 = new Person(2, "Mazel");
        Person person3 = new Person(3, "Dazel");

        people.add(person1);
        people.add(person2);
        people.add(person3);

        people.remove(person1);
        people.remove(3);

        Assert.assertFalse(people.contains(person1));
        Assert.assertTrue(people.contains(person2));
        Assert.assertFalse(people.contains(person3));

    }

    @Test
    public void testFindById(){

        People people = new People();
        Person person1 = new Person(1, "Hazel");
        Person person2 = new Person(2, "Mazel");

        people.add(person1);
        people.add(person2);

        Assert.assertEquals(person2, people.findById(2));

    }

    /*
    Create a testFindById method which ensures that a respective Person object with a respective
    id field is returned upon invokation of the findById method on a respective People object.
     */

}
