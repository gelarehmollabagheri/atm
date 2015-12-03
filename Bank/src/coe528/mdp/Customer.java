/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.mdp;

/**
 *
 * @author Brian
 */
public class Customer extends User{
        
    public Customer(String name, String password, String accType, int cheqBalance, int savingBalance) {
        super(name, password, accType);
        if (cheqBalance >= 20 && savingBalance >= 20) {
            this.accType = "Chequing + Savings";
            this.cheqBalance = cheqBalance;
            this.savingBalance = savingBalance;
        } else {
            System.err.println("You must have funds greater or equal to 20$ in both accounts.");
        }
    }
    
}
