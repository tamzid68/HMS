/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

import java.util.Arrays;

/**
 *
 * @author ASM
 */
public class LoginData {

    private final String userid = "Tamzid";
    private final char[] pass = {'1', '2', '3', 'a', 's', 'm'};

    public LoginData() {

    }

    public boolean isValid(String user, char[] password) {
        boolean validUser = this.userid.equals(user);
        boolean validPass = Arrays.equals(this.pass, password);

        Arrays.fill(password, '0');

        return validUser && validPass;

    }

}
