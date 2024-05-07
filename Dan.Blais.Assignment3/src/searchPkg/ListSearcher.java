package searchPkg;

import dataManagementPkg.ListManager;
import dataManagementPkg.MapManager;
import postalCodePkg.PostalCodeEntry;
import postalCodePkg.RandomPostalCode;

import java.util.List;

/*
 * Filename: ListSearcher.Java
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
 * search an ArrayList. The search performed is a linear search and checks if
 * a given value matches the prefix attribute of a PostalCodeEntry in the Arraylist.>
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
public class ListSearcher {

    /**
     * Constructs a ListSearcher object.
     */
    public ListSearcher() {}

    /**
     * This method accepts a String and an ArrayList and then checks to see if the
     * ArrayList contains a PostalCodeEntry object with a prefix attribute that matches
     * the String using the matches method of the String class.
     * @param prefix A string that represents a prefix to be looked up in the ArrayList.
     * @param pCodeArray An ArrayList of type PostalCodeEntry which will be searched.
     * @return A String that will contain either the toString of the matching ArrayList value,
     *         or "NOT FOUND" if no matching key is found.
     */
    public String searchPostalCodeList(String prefix, List<PostalCodeEntry> pCodeArray) {
        boolean matchFound;
        for (PostalCodeEntry postalCodeEntry : pCodeArray) {
            matchFound = postalCodeEntry.getPrefix().matches(prefix);
            if(matchFound)
                return postalCodeEntry.toString();
        }
        return "NOT FOUND";
    }
}
