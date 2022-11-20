package com.github.curriculeon;

import org.junit.Assert;

public class TestPerson {
    //Given
    public void constructorTest(Long expectedId, String expectedName) {
        //When
        Person person = new Person(expectedId, expectedName);

        //Then
        Long actualId = person.getId();
        String actualName = person.getName();

        Assert.assertEquals(expectedId,actualId);
        Assert.assertEquals(expectedName, actualName);


    }
}
