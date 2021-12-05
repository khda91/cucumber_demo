package com.github.khda91.cucumber.demo.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Person {

    @JsonProperty("first_name")
    @JsonAlias("firstName")
    private String firstName;

    private String lastName;

    private String middleName;

    private Integer age;
}
