package com.bhavesh.practice.collections;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> cities  = new HashSet<>();

        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");
        System.out.println("Set; " + cities);
        System.out.println("------------------------------");

        //remove() -  removes as element from the set
        System.out.println("Removed Element- \"Mumbai\": " +cities.remove("Mumbai"));
        System.out.println("Remaining set: " + cities);
        System.out.println("------------------------------");

        Set<String> newCitiesSet = new HashSet<>();
        //addAll()- adds all element of one to another
        newCitiesSet.addAll(cities);
        newCitiesSet.add("Bengaluru");
        System.out.println("New Cities Set: " + newCitiesSet);
        System.out.println("------------------------------");

        //contains() - returns true if a set contains specified element
        if (newCitiesSet.contains(2)){
            System.out.println(2 + " value is present in newCitiesSet");
        }

        if (newCitiesSet.contains("Bengaluru")){
            System.out.println("\"Bengaluru\" value is present in newCitiesSet");
        }
        System.out.println("------------------------------");

        //size() - returns the length of set
        System.out.println("Size of newCitiesSet: " + newCitiesSet.size());
        System.out.println("------------------------------");

        //iterator() - returns iterator object that can be used to sequentially access element of set
        Iterator<String> citiesIterator = newCitiesSet.iterator();
        while (citiesIterator.hasNext()){
            System.out.println("next element in newCitiesSet: " + citiesIterator.next());
        }
        System.out.println("------------------------------");

        //for each loop example
        System.out.println("using for each loop:");
        for (String city : newCitiesSet){
            System.out.println("next city: " + city);
        }
        System.out.println("------------------------------");

        //toArray() - converts a set into an array
        // advance implementation with reference operator
        String[] citiesArray = newCitiesSet.toArray(String[]::new);
        //String[] citiesArray = newCitiesSet.toArray(new String[newCitiesSet.size()]);
        for (String city : citiesArray){
            System.out.println("conversion to Array: " + city);
        }
        System.out.println("------------------------------");

        //removeAll() - removes all element from the set
        System.out.println("Before removal - Cities Set: " + cities);
        System.out.println("Before removal - New Cities Set: " + newCitiesSet);
        System.out.println("removed all element of cities set from newCitiesSet: " + newCitiesSet.removeAll(cities));
        System.out.println("After removal - remaining New Cities Set : " + newCitiesSet);
        System.out.println("------------------------------");

        //clear() - removes All the element from the set (more efficient tha removeALl())
        System.out.println("Size of newCitiesSet before clear(): " + newCitiesSet.size());
        newCitiesSet.clear();
        System.out.println("Size of newCities after clear(): " + newCitiesSet.size());

        //iterator() - returns an iterator that can be used to access elements of the set sequentially
        //remove() - removes the specified element from the set
        //removeAll() - removes all the elements from the set that is present in another specified set
        //retainAll() - retains all the element in the set that are also present in another specified set
        //clear() - removes all the element from the set
        //size() - returns the length(number of elements) of the set
        //toArray() -returns an array containing all the elements of the set
        //contains() - returns true if the set contains specified element
        //containAll() - returns true if the set contains all the element of the specified collection
        //hashCode() - returns the hash code value (address of the element in the set)



    }
}
