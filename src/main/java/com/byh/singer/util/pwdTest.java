package com.byh.singer.util;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;

public class pwdTest {
    public static void main(String[] args) {
        String password = "123456";
        String salt = new SecureRandomNumberGenerator().nextBytes().toString();
        int times = 2;
        String algorithmName = "md5";
        String encodedPassword = new SimpleHash(algorithmName,password,salt,times).toString();
       System.out.println("salt:"+salt);
       System.out.println("encodedPassword:"+encodedPassword);
    }
}
