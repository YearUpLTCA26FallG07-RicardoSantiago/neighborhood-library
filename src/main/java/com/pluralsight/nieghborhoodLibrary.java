package com.pluralsight;

import java.util.Scanner;


public class nieghborhoodLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          Book[] books= new Book[20];

        //Library

        books[0] = new Book(3001, "987654321", "Lolita", false, "No one");
        books[1] = new Book(3002, "987654322", "Lord of the Rings", true, "K");
        books[2] = new Book(3004, "987654323","Harry Potter and the Sorcerer's Stone", true, "Sayf" );
        books[4] = new Book(3005, "987654324","Harry Potter and the Chamber of Secrets", true, "Sayf" );
        books[5] = new Book(3006, "987654325","Harry Potter and the Prizoner of Azkaban", true, "Sayf" );
        books[6] = new Book(3007, "987654326","Harry Potter and the Goblet of Fire", true, "Sayf" );
        books[7] = new Book(3008, "987654327","Harry Potter and the Order of the Pheonix", true, "Sayf" );
        books[8] = new Book(3009, "987654328","Harry Potter and the Half-blood Prince", true, "Sayf" );
        books[9] = new Book(3010, "987654329", "Harry Potter and the Deathly Hallows", true, "Sayf");
        books[10] = new Book(3011, "987654330","The Catcher in the Rye", false, "No one" );
        books[11] = new Book(3012, "987654331","The Great Gatsby", true, "Dulah" );
        books[12] = new Book(3013, "987654332","An Ember inn the Ashes", false, "No one" );
        books[13] = new Book(3014, "987654333","Catacomb", true, "Dulah");
        books[14] = new Book(3015, "987654334","Crooked Kingdom", false, "No one");
        books[15] = new Book(3016, "987654335","Gemina", false, "No one");
        books[16] = new Book(3017, "987654336","Ruin and Rising", true, "Dulah");
        books[17] = new Book(3018, "987654337","Sanctum", true, "Dulah");
        books[18] = new Book(3019, "987654338","Six of Crows", true, "Dulah");
        books[19] = new Book(3020, "987654339","The Alchemist", true, "Dulah");


        // Menu interface

        int command = 0;

        while(command!=3) {

            System.out.println("Welcome! \n \n What woud you like to do?");
        }

    }
}
