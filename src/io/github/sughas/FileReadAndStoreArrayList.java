/**
 * Copyright 2021 sughas R K * * Collection Framework*
 */
package io.github.sughas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Simple class which reads and data from a file and stores in List
 */
public class FileReadAndStoreArrayList {
    private static final List dataFromFile = new ArrayList<String>();

    public static void main( String[] args ) {

        String pathToCsv = "/home/sughas/Downloads/InputTest.txt";
        try {
            File myObj = new File(pathToCsv);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                dataFromFile.add(data); //Store the data from file to List
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        /**
         * Using enhanced for loop to print from ArrayList
         */
        for(Object a: dataFromFile)
            System.out.println(a);
    }
}
