/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author reshma
 */
public class AccountDirectory {
    
    private ArrayList<Account> accDirectory;

    public AccountDirectory() {
        this.accDirectory = new ArrayList<>();
    }

    public ArrayList<Account> getAccDirectory() {
        return accDirectory;
    }

    public void setAccDirectory(ArrayList<Account> accDirectory) {
        this.accDirectory = accDirectory;
    }
    
    public Account addAccount() {
        Account account = new Account();
        accDirectory.add(account);
        return account;
    }
    
    public void deleteAccount(Account account) {
        accDirectory.remove(account);
    }
    
    public Account searchAccount(String accountNumber){
        for(Account account: accDirectory){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }
}
