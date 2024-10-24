package com.bhavesh.practice.accessModifiers.service;

import com.bhavesh.practice.accessModifiers.model.Person;
import com.bhavesh.practice.accessModifiers.model.PersonHandler;

public class AccessModifiersD {
    public static void main(String[] args) {
        PersonHandler handler = new PersonHandler();
        Person person = handler.createPerson();
        System.out.println("Personal details: " + person);
    }
}
