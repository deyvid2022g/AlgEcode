package com.algebradecode.controller;

import com.algebradecode.service.HillCipherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hillcipher")
public class HillCipherController {

    private final HillCipherService hillCipherService;

    public HillCipherController(HillCipherService hillCipherService) {
        this.hillCipherService = hillCipherService;
    }

    @PostMapping("/encrypt")
    public String encrypt(@RequestParam String message, @RequestParam String key) {
        return hillCipherService.encrypt(message, key);
    }

    @PostMapping("/decrypt")
    public String decrypt(@RequestParam String message, @RequestParam String key) {
        return hillCipherService.decrypt(message, key);
    }
}
