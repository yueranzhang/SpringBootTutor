package com.example.demo.controller;


import com.example.demo.service.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SumController {
    @Autowired
    SumService sumService;
    @GetMapping(path = "/sum/{inputString1}-{inputString2}", produces = "application/json")
    public HttpEntity searchCourse(@PathVariable("inputString1") int inputString1, @PathVariable("inputString2") int inputString2 ) {

        int result = sumService.twoSumService(inputString1,inputString2);
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
