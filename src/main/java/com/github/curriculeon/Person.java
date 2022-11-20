package com.github.curriculeon;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Person {
    public Person() {
    }

    private long id; //should be "final"
    private String name;


    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }



    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
