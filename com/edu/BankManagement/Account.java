package com.edu.BankManagement;

public class Account {
    String holder_name_;
    private String account_type_;
    private float balance_;
    // private String create_date_;
    int account_id_;
    private String pin_;


    public Account(String holder_name, String account_type, float balance, int account_id, String pin) {
        holder_name_ = holder_name;
        account_type_ = account_type;
        balance_ = balance;
        account_id_ = account_id;
        pin_ = pin;
        //create_date_ = new
    }
}