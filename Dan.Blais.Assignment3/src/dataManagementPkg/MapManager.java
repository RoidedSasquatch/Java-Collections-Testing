package dataManagementPkg;

import postalCodePkg.PostalCodeEntry;
import postalCodePkg.RandomPostalCode;
import searchPkg.ListSearcher;

import java.util.HashMap;
import java.util.Map;

/*
 * Filename: MapManager.Java
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
 * populate a HashMap with split values from a postal code array. It also
 * contains an accessor for the HashMap. The HashMap uses a String
 * as a key and is of type PostalCodeEntry.>
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
public class MapManager {
    Map<String, PostalCodeEntry> postalCodeMap;

    /**
     * Constructs a MapManager object and initializes the HashMap.
     */
    public MapManager() {
        postalCodeMap = new HashMap<>();
    }

    /**
     * Takes a String array as a parameter and then splits the string into a new
     * array which is passed to the populatePostalCodeMap function.
     *
     * @param pcArray An array of postal code information which will be split
     *                and used to populate the HashMap.
     */
    public void processPostalCodeMap(String[] pcArray) {
        String[] splitArray;
        for(String postalCode: pcArray) {
            splitArray = postalCode.split(",");
            populatePostalCodeMap(splitArray);
        }
    }

    /**
     * Private helper method which will accept a String array and create a
     * new instance of PostalCodeEntry based on the String array's values.
     * It will also add this instance to the HashMap using the postal code
     * prefix as the key. It does this using the put method of the Map interface.
     * @param splitArray A String array which represents the split values of
     *                   a postal code String array.
     */
    private void populatePostalCodeMap(String[] splitArray) {
        PostalCodeEntry pCode = new PostalCodeEntry(splitArray);
        postalCodeMap.put(pCode.getPrefix(), pCode);
    }

    /**
     * Accessor for the postalCodeMap HashMap.
     * @return the postalCodeMap HashMap.
     */
    public Map<String, PostalCodeEntry> getPostalCodeMap() {
        return postalCodeMap;
    }
}
