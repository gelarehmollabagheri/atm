/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.mdp;

import java.util.ArrayList;

/**
 *
 * @author Brian
 */
public class User{
    protected String name;
    protected String password;
    protected String accType;
    ArrayList<User> database = new ArrayList<User>();
    private User current;
    
    public User(String name, String password, String accType) {
        this.name=name;
        this.password=password;
        this.accType=accType;
        database.add(this);
    }
    
    public void changePassword(String password) {
        current.password = password;
    }
    
    public int searchUser(String name) {
        String temp = "";
        for (int i = 0; i<database.size(); i++) {
            temp = database.get(i).name;
            if (name.equalsIgnoreCase(temp)) {
                return i;
            }
        }
        System.err.println("No accounts exist with the following name: " + name);
        return 0;
    }
    
    public String getAccType(String name) {
        int i = searchUser(name);
        if (i != 0) {
            return database.get(i).accType;
        } else {
            System.err.println("No accounts exist with the following name: " + name);
            return "User does not exist";
        }
    }
    
    public boolean login(String name, String password) {
        int i = searchUser(name);
        String temp = database.get(i).password;
        if (temp == password) {
            current = database.get(i);
            System.out.println("Login successful.");
            return true;
        } else {
            System.err.println("Login failed.");
            return false;
        }
    }
    
    public void logout() {
        current = null;
        System.out.println("Logout succesful.");
    }   
    
 
}
