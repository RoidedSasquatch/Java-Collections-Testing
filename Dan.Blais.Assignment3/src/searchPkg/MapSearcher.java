package searchPkg;

import dataManagementPkg.ListManager;
import dataManagementPkg.MapManager;
import postalCodePkg.PostalCodeEntry;
import postalCodePkg.RandomPostalCode;

import java.util.Map;

/*
 * Filename: MapSearcher.Java
 * Student: Dan Blais 040826486
 * Course: CST8284 301 OOP
 * Assignment: Assignment 03
 * Date: April 6, 2024
 * Professor: Professor George Kriger
 * Purpose: Learn polymorphism through the implementation of interfaces.
 * Classlist: PostalCodeSearchTest.java, PostalCodeEntry.Java, RandomPostalCode.java, ListSearcher.java, MapSearcher.java, ListManager.java, MapManager.java
 */

/**
 *
 * This class represents an object which will contain functions that will
 * search a HashMap. The search performed is a linear search and checks if
 * a given value matches a key in the HashMap.>
 *
 * @author Dan Blais
 * @version Java 17
 * @see PostalCodeEntry
 * @see RandomPostalCode
 * @see ListManager
 * @see MapManager
 * @see ListSearcher
 * @see MapManager
 */
public class MapSearcher {

    /**
     * Constructs a MapSearcher object.
     */
    public MapSearcher() {}

    /**
     * This method accepts a String and a HashMap and then checks to see if the
     * HashMap contains a key that matches the String using the containsKey method
     * of the Map interface.
     * @param key A string that represents a key to be looked up in the HashMap.
     * @param pCodeMap A HashMap of type String, PostalCodeEntry which will be searched.
     * @return A String that will contain either the toString of the value mapped to a matching key,
     *         or "NOT FOUND" if no matching key is found.
     */
    public String searchPostalCodeMap(String key, Map<String, PostalCodeEntry> pCodeMap) {
        boolean matchFound;
        for(int i = 0; i < pCodeMap.size(); i ++) {
            matchFound = pCodeMap.containsKey(key);
            if(matchFound)
                return pCodeMap.get(key).toString();
        }
        return "NOT FOUND";
    }
}
