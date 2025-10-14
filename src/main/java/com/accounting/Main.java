/**
 * @author Jasmine Tu
 * Capstone 1 - Accounting Ledger App
 *
 * Entry point.
 */

package com.accounting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // variables & constants
        final String FILE_PATH = "src/main/resources/transactions.csv";

        Scanner scnr = new Scanner(System.in);
        TransactionList transactionList = new TransactionList();

        //load CSV file of transactions
        transactionList.loadFromCsv(FILE_PATH);

        //title
        System.out.print("•·················•·················•" +
                Utility.boldString("\n\t\tBunny Bistro") + "🍵ིྀ༘₍ᐢ. .ᐢ₎₊˚⊹" +
                "\n\t\t> Sales & Purchases <");

        //enter home screen
        HomeScreen.showHome(scnr, transactionList);

        //save new transactions when exited
        transactionList.saveToCsv(FILE_PATH);
        scnr.close();
    }
}
