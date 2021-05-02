package com.kkb.zookeeper.base64;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Base64;

public class Test {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String usernameAndPassword = "spark:123456";
        //生成密码:sha1加密之后base64编码
        byte digest[] = MessageDigest.getInstance("SHA1").digest(usernameAndPassword.getBytes());
        Base64 base64 = new Base64();
        String encodeToString = base64.encodeToString(digest);
        System.out.println(encodeToString);//s73bPZjm3V8zIIO/SbaLwnJJmok=
    }
}