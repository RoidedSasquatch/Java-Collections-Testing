package dataManagementPkg;

import postalCodePkg.PostalCodeEntry;
import postalCodePkg.RandomPostalCode;
import searchPkg.ListSearcher;

import java.util.ArrayList;
import java.util.List;

/*
 * Filename: ListManager.Java
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
 * populate an ArrayList with split values from a postal code array. It also
 * contains an accessor for the ArrayList. The ArrayList is of type PostalCodeEntry.>
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
public class ListManager {
    private List<PostalCodeEntry> postalCodeList;

    /**
     * Constructs a ListManager object and initializes the ArrayList.
     */
    public ListManager() {
        postalCodeList = new ArrayList<>();
    }

    /**
     * Takes a String array as a parameter and then splits the string into a new
     * array which is passed to the populatePostalCodeList function.
     *
     * @param pcArray An array of postal code information which will be split
     *                and used to populate the ArrayList.
     */
    public void processPostalCodeArray(String[] pcArray) {
        String[] splitArray;
        for(String postalCode : pcArray) {
            splitArray = postalCode.split(",");
            populatePostalCodeList(splitArray);
        }
    }

    /**
     * Private helper method which will accept a String array and create a
     * new instance of PostalCodeEntry based on the String array's values.
     * It will also add this instance to the ArrayList. It does this using
     * the add method of the List interface.
     * @param splitArray A String array which represents the split values of
     *                   a postal code String array.
     */
    private void populatePostalCodeList(String[] splitArray) {
        postalCodeList.add(new PostalCodeEntry(splitArray));
    }

    /**
     * Accessor for the postalCodeList ArrayList.
     * @return the postalCodeList ArrayList.
     */
    public List<PostalCodeEntry> getPostalCodeList() {
        return postalCodeList;
    }
}
