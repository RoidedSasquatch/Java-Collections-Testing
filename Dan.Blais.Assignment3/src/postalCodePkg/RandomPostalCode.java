package postalCodePkg;

import java.util.Random;

/*
 * Filename: RandomPostalCode.Java
 * Student: Dan Blais 040826486
 * Course: CST8284 301 OOP
 * Assignment: Assignment 03
 * Date: April 6, 2024
 * Professor: Professor George Kriger
 * Purpose: Learn polymorphism through the implementation of interfaces.
 * Classlist: PostalCodeSearchTest.java, PostalCodeEntry.Java, RandomPostalCode.java, ListSearcher.java, MapSearcher.java, ListManager.java, MapManager.java
 */

/**
 * Utility class containing methods for randomly generating portions of standard
 * Canadian postal code.
 *
 * @author kriger
 * @version Java 17
 * @see PostalCodeEntry
 * @see RandomPostalCode
 * @see dataManagementPkg.ListManager
 * @see dataManagementPkg.MapManager
 * @see searchPkg.ListSearcher
 * @see dataManagementPkg.MapManager
 */
public final class RandomPostalCode {
    final static Random rand = new Random(); // provide a seed value to get
    // same random sequence
    // remove seed after testing;
    final static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final static String number = "0123456789";

    /**
     * randomly generates the prefix portion of a standard Canadian Postal code
     * @return a random prefix
     */
    public static String getRandomPrefix() {
        int randA = rand.nextInt(alpha.length());
        int randN = rand.nextInt(number.length());

        return "K" + number.charAt(randN) + alpha.charAt(randA);
    }// getRandom()
}

