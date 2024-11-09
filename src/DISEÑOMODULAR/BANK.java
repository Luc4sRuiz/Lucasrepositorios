/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DISEÑOMODULAR;

/**
 *
 * @author Lucas
 */
public class BANK {
    private double balance;
    
    public BANK(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Depósito realizado. Nuevo saldo: " + balance);
        } else {
            System.out.println("Cantidad de depósito inválida.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Retiro realizado. Nuevo saldo: " + balance);
        } else {
            System.out.println("Cantidad de retiro inválida o saldo insuficiente.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

