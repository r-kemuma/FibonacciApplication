package com.example.fibonacciapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FibonacciController {
    @Autowired
    private FibonacciService fibonacciService;

    @GetMapping("/fibonacci")
    public List<Integer> getFibonacciSeries(@RequestParam int n){
        return fibonacciService.generateFibonacciSeries(n);
    }

}
