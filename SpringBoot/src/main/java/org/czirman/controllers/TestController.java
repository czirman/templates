package org.czirman.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @PostMapping(path ="/test")
    public ResponseEntity<String> test(/* final @RequestBody CreditAss cs */){
        return new ResponseEntity("ff", HttpStatus.OK);

    }
}