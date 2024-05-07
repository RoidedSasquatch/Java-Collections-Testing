package postalCodePkg;

/*
 * Filename: PostalCodeEntry.Java
 * Student: Dan Blais 040826486
 * Course: CST8284 301 OOP
 * Assignment: Assignment 03
 * Date: April 6, 2024
 * Professor: Professor George Kriger
 * Purpose: Learn polymorphism through the implementation of interfaces.
 * Classlist: PostalCodeSearchTest.java, PostalCodeEntry.Java, RandomPostalCode.java, ListSearcher.java, MapSearcher.java, ListManager.java, MapManager.java
 */

/**
 * A class representing a Canadian standard postal code
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
public class PostalCodeEntry {
    String prefix;
    String place_name;
    String province;
    String latitude;
    String longitude;

    /**
     * 5 arg constructor
     * @param prefix		first half of postal code
     * @param place_name	name of the location
     * @param province		province name
     * @param latitude		latitude of centre of postal code area
     * @param longitude		longitude of centre of postal code area
     */
    public PostalCodeEntry(String prefix, String place_name, String province, String latitude,
                           String longitude) {
        this.prefix = prefix;
        this.place_name = place_name;
        this.province = province;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    /**
     * No-arg constructor
     * sets all instance variables to null
     */
    public PostalCodeEntry() {
    }

    /**
     * like 5 arg constructor, but parameter is an array containing the 5 fields,
     * the equivalent of 1 row in the .csv file
     * @param fields array of 5 fields
     */
    public PostalCodeEntry(String[] fields) {
        this(fields[0],fields[1],fields[2],fields[3],fields[4]);
    }

    /**
     * getter for the prefix portion of the postal code
     * @return	prefix portion of postal code
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * ToString method which returns a String representation of this class.
     * @return A String representation of this class.
     */
    @Override
    public String toString() {
        return String.format("%11s, %s, %s, %s, %s",
                prefix, place_name, province, latitude, longitude);
    }
}//class

