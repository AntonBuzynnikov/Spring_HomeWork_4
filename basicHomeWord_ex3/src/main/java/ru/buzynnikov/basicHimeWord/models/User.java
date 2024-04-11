package ru.buzynnikov.basicHimeWord.models;

import java.util.StringJoiner;

public class User {
    private String firstName;
    private String lastName;

    public String getLastname() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("firstName='" + firstName + "'")
                .add("lastname='" + lastName + "'")
                .toString();
    }
}
