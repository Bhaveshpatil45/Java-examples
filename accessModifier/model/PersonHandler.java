package accessModifier.model;

import java.util.Scanner;

public class PersonHandler {
    public Person createPerson(){
        System.out.println("Please enter person name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Please enter Person city: ");
        String city = scanner.nextLine();

        System.out.println("Please enter Person height in Cm; ");
        String heightInCm = scanner.nextLine();

        System.out.println("Please enter person weight in Kg: ");
        String weightInKg = scanner.nextLine();

        System.out.println("Please enter Person salary: ");
        String salary = scanner.nextLine();

        Person person1 = new Person(Integer.parseInt(heightInCm), Integer.parseInt(weightInKg), Integer.parseInt(salary));
        person1.name = name;
        person1.city = city;

        return person1;

    }
}