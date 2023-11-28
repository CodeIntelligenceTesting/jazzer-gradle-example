package org.example;

import com.code_intelligence.jazzer.junit.FuzzTest;

class PersonTest {

    @FuzzTest(maxDuration = "1m")
    void fuzzPerson(String firstName, String lastName, int age) {
        new Person(firstName, lastName, age);
    }
}
