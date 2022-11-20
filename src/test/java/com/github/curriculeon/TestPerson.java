package com.github.curriculeon;

import org.junit.Assert;

public class TestPerson {
    //Given
    public void constructorTest(Long expectedId, String expectedName) {

        Person person = new Person(expectedId, expectedName);

        //When
        Long actualId = person.getId();
        String actualName = person.getName();
        //Then
        Assert.assertEquals(expectedId,actualId);
        Assert.assertEquals(expectedName, actualName);


    }
    //Given
    public void testSetName(String expected) {
        //Given
        Person person = new Person(expected);

        //When
        person.setName(expected);
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
