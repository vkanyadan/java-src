package com.edu.BankManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by vibs on 12/29/16.
 */



public class Test {


    public static void main(String[] args) {
        String name_of_bank = "Bank of podunk";
        String location = "Ulhasnagar";
        String hours = "Always";

        Bank new_bank = new Bank(name_of_bank,location, hours, 1);
        System.out.println("Created bank: " + new_bank.name_);
        new_bank.createAcccount("Vibhav", "checking", 1000, 1, "1000");
        new_bank.createAcccount("Balaji", "checking", 1000, 2, "1001");

        new_bank.printAccounts();

    }


}
