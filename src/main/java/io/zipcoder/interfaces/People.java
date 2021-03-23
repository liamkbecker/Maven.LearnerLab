package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterator {

    List<Person> list;

    public People(){
        this.list = new ArrayList<Person>();
    }

    public void add(Person person){
        this.list.add(person);
    }

    public Person findById(long id){
        for(int i = 0; i < this.list.size(); i++){
            if(this.list.get(i).getId() == id){
                return this.list.get(i);
            }
        }
        return null;
    }

    public String getNameById(long id){
        for(int i = 0; i < this.list.size(); i++){
            if(this.list.get(i).getId() == id){
                return this.list.get(i).getName();
            }
        }
        return "";
    }

    public boolean contains(Person person){
        for(int i = 0; i < this.list.size(); i++){
            if(this.list.get(i).equals(person)){
                return true;
            }
        }
        return false;
    }

    public void remove(Person person){
        for(int i = 0; i < this.list.size(); i++){
            if(this.list.get(i).equals(person)){
                this.list.remove(this.list.get(i));
                break;
            }
        }
    }

    public void remove(long id){
        for(int i = 0; i < this.list.size(); i++){
            if(this.list.get(i).getId() == id){
                this.list.remove(this.list.get(i));
                break;
            }
        }
    }

    public void removeAll(){
        this.list = new ArrayList<Person>();
    }

    public int count(){
        return this.list.size();
    }

    public Person[] toArray(){

        Person[] returnArray = new Person[this.list.size()];
        for(int i = 0; i < returnArray.length; i++){
            returnArray[i] = this.list.get(i);
        }
        return returnArray;

    }

    public void iterator(){

    }

    public boolean hasNext() { return false; }

    public Object next() { return null; }

    public void remove() { }


    //The class should implement Iterable<E> and define a method named iterator
    //which makes use of the personList field to generate a new a Iterator<E>.


}
