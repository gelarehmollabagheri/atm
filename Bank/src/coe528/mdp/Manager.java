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
public class Manager extends User{
    
    public Manager(String name, String password, String accType) {
        super(name, password, accType);
        this.name = "admin";
        this.password = "admin";
        this.accType = "Manager";
    }
}
