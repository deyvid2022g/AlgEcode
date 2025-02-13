package com.algebradecode.utils;

public class HillCipherUtil {

    public static String encrypt(String message, String key) {
        return "Encrypted(" + message + ") with key: " + key;
    }

    public static String decrypt(String message, String key) {
        return "Decrypted(" + message + ") with key: " + key;
    }
}

