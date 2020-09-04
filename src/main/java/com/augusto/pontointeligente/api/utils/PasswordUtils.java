package com.augusto.pontointeligente.api.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordUtils {

    @Autowired
    PasswordEncoder passwordEncoder;

    public String generateBCrypt(String password){
        if(password == null)
            return null;

        return passwordEncoder.encode(password);
    }

    public boolean validate(String password,String passwordEncoded){

        return passwordEncoder.matches(password,passwordEncoded);
    }

}
