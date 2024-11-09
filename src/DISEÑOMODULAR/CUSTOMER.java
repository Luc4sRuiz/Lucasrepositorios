/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DISEÑOMODULAR;

/**
 *
 * @author Lucas
 */
public class CUSTOMER {
    private String name;
    private BANK account;

    public CUSTOMER(String name, double initialBalance) {
        this.name = name;
        this.account = new BANK(initialBalance);
    }

    public String getName() {
        return name;
    }

    public BANK getAccount() {
        return account;
    }
}

