package accessModifier.service;

import accessModifier.model.Person;
import accessModifier.model.PersonHandler;

public class AccessModifiersD {
    public static void main(String[] args) {
        PersonHandler handler = new PersonHandler();
        Person person = handler.createPerson();
        System.out.println("Personal details: " + person);
    }
}
