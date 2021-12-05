package com.github.khda91.cucumber.demo.step;

import com.github.khda91.cucumber.demo.model.Person;
import io.cucumber.java.en.Given;
import java.util.List;

public class Step {

    @Given("I have data table with following data")
    public void haveDataTableWithFollowingData(Person person) {
        System.out.println(person);
    }

    @Given("I have data table with following set of data")
    public void haveDataTableWithFollowingSetOfData(List<Person> person) {
        System.out.println(person);
    }
}
