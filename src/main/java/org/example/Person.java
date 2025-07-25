package org.example;

public record Person(String firstName, String lastName, int age) {
    public Person {
    }

    public Person(String name, int age) {
        this(name.split("", 1)[0], name.split("", 1)[1], age);
    }

    public void run(byte[] data){
        assert data != null : "Data cannot be null";
        assert data.length > 0 : "Data length must be greater than zero";
        assert data.length <= 10 : "Data length must be less than or equal to 10";
    }
}
