package com.algebradecode.service;

import com.algebradecode.utils.HillCipherUtil;
import org.springframework.stereotype.Service;

@Service
public class HillCipherService {

    public String encrypt(String message, String key) {
        return HillCipherUtil.encrypt(message, key);
    }

    public String decrypt(String message, String key) {
        return HillCipherUtil.decrypt(message, key);
    }
}