package com.djl;

import java.security.MessageDigest;
import java.util.UUID;

/**
 * Created by dongjunliang on 2018-5-22.
 */
public class SingletonPattern {

    public static void main(String[] args) {
        System.out.println(UUID.randomUUID());
        System.out.println(md5("+vmwV3BaMJ"));
    }

    public final static String md5(String s) {

        try {
            byte[] strTemp = s.getBytes("UTF-8");
            MessageDigest mdTemp = MessageDigest.getInstance("MD5");
            mdTemp.update(strTemp);
            byte[] md = mdTemp.digest();
            return Hex.encodeHexString(md).toLowerCase();
        } catch (Exception e) {
            return "";
        }
    }
}
