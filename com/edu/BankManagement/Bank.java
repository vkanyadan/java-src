package com.edu.BankManagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
    final String name_;
    private final String location_;
    private int number_of_offices_;
    private final String hours_;
    private int number_of_accounts_;
    private float available_cash_;
    private int number_of_employees_;
    // List of employees
    private List<Employee> employees_;
    // List of accounts
    private List<Account> accounts_;
    // TODO:
    // Building details


    public Bank(String name,
                String location,
                String hours,
                int number_of_offices) {
        name_ = name;
        location_ = location;
        hours_ = hours;
        number_of_offices_ = number_of_offices;
        number_of_accounts_ = 0;
        available_cash_ = 0;
        number_of_employees_ = 0;
        employees_ = new ArrayList<>();
        accounts_ = new ArrayList<>();

    }

    public void createAcccount(String holder_name, String account_type, float balance, int account_id, String pin) {
        Account customer_account = new Account(holder_name, account_type, balance, account_id, pin);
        accounts_.add(customer_account);
        return;
    }

    public boolean deleteAccount(int account_id) {
        for (Iterator<Account> iterator = accounts_.iterator(); iterator.hasNext(); ) {
            Account act = iterator.next();
            if (act.account_id_ == account_id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public void printAccounts() {
        for (Iterator<Account> iterator = accounts_.iterator(); iterator.hasNext(); ) {
            Account act = iterator.next();
            System.out.println("account name: " + act.holder_name_);
        }
    }
}