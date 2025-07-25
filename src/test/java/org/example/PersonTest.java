package org.example;

import com.code_intelligence.jazzer.junit.FuzzTest;
import com.code_intelligence.jazzer.mutation.annotation.NotNull;
import com.code_intelligence.jazzer.mutation.annotation.WithLength;

class PersonTest {

    @FuzzTest(maxDuration = "1m")
    void fuzzPerson(String firstName, String lastName, int age, byte @NotNull @WithLength(min = 1, max = 10)[] data) {
        Person p = new Person(firstName, lastName, age);
        p.run(data);
    }
}
