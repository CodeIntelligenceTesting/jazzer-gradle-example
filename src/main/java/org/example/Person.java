package org.example;

public record Person(String firstName, String lastName, int age) {
    public Person {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    public Person(String name, int age) {
        this(name.split("", 1)[0], name.split("", 1)[1], age);
    }
}
