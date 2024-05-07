import dataManagementPkg.ListManager;
import dataManagementPkg.MapManager;
import postalCodePkg.PostalCodeEntry;
import postalCodePkg.RandomPostalCode;
import searchPkg.ListSearcher;
import searchPkg.MapSearcher;

/*
 * Filename: PostalCodeSearchTest.Java
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
 * This class contains the main method which drives the program. The method will create instances
 * of ListManager, MapManager, ListSearcher, and MapSearcher and use their ,
 * as well as the methods of RandomPostalCode, to search an ArrayList and HashMAp
 * for randomly generated postal code prefixes. The found status and search time will also be
 * printed to the console.
 *
 * @author kriger
 * @author Dan Blais
 * @version Java 17
 * @see PostalCodeEntry
 * @see RandomPostalCode
 * @see ListManager
 * @see MapManager
 * @see ListSearcher
 * @see MapManager
 */

public class PostalCodeSearchTest {

    /**
     * Default Constructor
     */
    public PostalCodeSearchTest(){}

    /**
     * The main method which drives the program. Creates an array of postal code information,
     * as well as instances of the Manager and Search classes. It then uses the methods contained
     * within those classes to search an ArrayList and HashMap for randomly generated postal code
     * prefixes.
     * @param args command line arguments - not used in this program
     */
    public static void main(String[] args) {
        //Declare postal code array
        String[] pcArray = {
                "K1A,Government of Canada Ottawa and Gatineau offices,Ontario,45.4207,-75.7023",
                "K1B,Gloucester (Blackburn Hamlet / Pine View),Ontario,45.4325,-75.5624",
                "K1C,Gloucester (West Orleans),Ontario,45.4805,-75.5237",
                "K1E,Orleans (Queenswood),Ontario,45.4882,-75.5199",
                "K1G,Ottawa (Riverview / Hawthorne),Ontario,45.4118,-75.6304",
                "K1H,Ottawa (Alta Vista),Ontario,45.3938,-75.6639",
                "K1J,Gloucester (Beacon Hill / Cyrville),Ontario,45.422,-75.6303",
                "K1K,Ottawa (Overbrook),Ontario,45.4354,-75.6475",
                "K1L,Ottawa (Vanier),Ontario,45.44,-75.6524",
                "K1M,Ottawa (Rockcliffe Park / New Edinburgh),Ontario,45.4461,-75.6744",
                "K1N,Ottawa (Lower Town / Sandy Hill / University of Ottawa),Ontario,45.3176,-75.895",
                "K1P,Ottawa (Parliament Hill),Ontario,45.423,-75.702",
                "K1R,Ottawa (West Downtown area),Ontario,45.4,-75.7235",
                "K1S,Ottawa (The Glebe / Ottawa South / Ottawa East),Ontario,45.4127,-75.6742",
                "K1T,Gloucester (Blossom Park / Hunt Club East / Leitrim),Ontario,45.352,-75.6421",
                "K1V,Ottawa (Riverside Park / Hunt Club West / Riverside South / YOW),Ontario,45.3523,-75.6512",
                "K1W,Gloucester (South Orleans),Ontario,45.436,-75.5471",
                "K1X,Gloucester South,Ontario,45.2884,-75.5992",
                "K1Y,Ottawa West,Ontario,45.399,-75.7304",
                "K1Z,Ottawa (Westboro),Ontario,45.3956,-75.7462",
                "K2A,Ottawa (Highland Park / Carlingwood),Ontario,45.3778,-75.7632",
                "K2B,Ottawa (Britannia / Pinecrest),Ontario,45.3679,-75.7888",
                "K2C,Ottawa (Queensway / Copeland / Carlington / Carleton Heights),Ontario,45.3594,-75.7523",
                "K2E,Nepean East,Ontario,45.3353,-75.7209",
                "K2G,Nepean (Davidson Heights),Ontario,45.3286,-75.7703",
                "K2H,Nepean (Bells Corners),Ontario,45.3155,-75.837",
                "K2J,Nepean (Barrhaven),Ontario,45.2882,-75.7566",
                "K2K,Kanata (Beaverbrook / South March),Ontario,45.3339,-75.9098",
                "K2L,Kanata (Katimavik-Hazeldean / Glen Cairn),Ontario,45.3125,-75.8838",
                "K2M,Kanata (Bridlewood),Ontario,45.2884,-75.8648",
                "K2P,Ottawa (Centre Town),Ontario,45.4129,-75.6901",
                "K2R,Nepean (Fallowfield Village / Cedarhill Estates / Orchard Estates),Ontario,45.2776,-75.7902",
                "K2S,Stittsville,Ontario,45.2573,-75.9153",
                "K2T,Kanata (Marchwood),Ontario,45.3121,-75.9217",
                "K2V,Kanata (Terry Fox / Palladium),Ontario,45.3018,-75.9081",
                "K2W,Kanata (North March),Ontario,45.3564,-75.9445",
                "K4A,Orleans (Fallingbrook),Ontario,45.4769,-75.4835",
                "K4B,Cumberland Township,Ontario,45.4251,-75.4288",
                "K4C,Cumberland,Ontario,45.5177,-75.4108",
                "K4K,Rockland,Ontario,45.5415,-75.3062",
                "K4M,Manotick,Ontario,45.2289,-75.6817",
                "K4P,Greely,Ontario,45.258,-75.5762",
                "K4R,Russell,Ontario,45.2573,-75.3675",
                "K6A,Hawkesbury,Ontario,45.6101,-74.6085"
        };
        //Create and initialize Manager and Search classes
        ListManager listManager = new ListManager();
        MapManager mapManager = new MapManager();
        ListSearcher listSearcher = new ListSearcher();
        MapSearcher mapSearcher = new MapSearcher();
        //Create and initialize array which will contain 10 randomly generated postal code prefixes
        String[] prefixArray = new String[10];
        //Variable which will store time in nanoseconds.
        long startTimer;

        //ArrayList Search
        listManager.processPostalCodeArray(pcArray);
        System.out.printf("%s%s", "***Using the ArrayList***", "\n");
        startTimer = System.nanoTime();
        for(int i = 0 ; i < prefixArray.length ; i++) {
            prefixArray[i] = RandomPostalCode.getRandomPrefix();
            System.out.printf("Retrieving: " + prefixArray[i] + "\n");
            System.out.printf("%18s", listSearcher.searchPostalCodeList(prefixArray[i], listManager.getPostalCodeList()) + "\n");
        }
        System.out.printf("\n%24s%d%s%s", "*** Using an arraylist took ", (System.nanoTime() - startTimer) / 1000000, " milliseconds to execute. ***", "\n\n");

        //Map Search
        mapManager.processPostalCodeMap(pcArray);
        System.out.printf("%s%s", "***Using the HashMap***", "\n");
        startTimer = System.nanoTime();
        for(int i = 0 ; i < prefixArray.length ; i++) {
            prefixArray[i] = RandomPostalCode.getRandomPrefix();
            System.out.printf("Retrieving: " + prefixArray[i] + "\n");
            System.out.printf("%18s", mapSearcher.searchPostalCodeMap(prefixArray[i], mapManager.getPostalCodeMap()) + "\n");
        }
        System.out.printf("\n%s%d%s%s", "*** Using a hashmap took ", (System.nanoTime() - startTimer) / 1000000, " millisecond(s) to execute. ***", "\n");
    }// main()
}// class