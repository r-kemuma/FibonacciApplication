package com.example.fibonacciapplication;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FibonacciService {
    public List<Integer> generateFibonacciSeries(int n){
        List<Integer> series=new ArrayList<>();
        if (n<=0){
            return series;
        }
        series.add(0);
        if(n==1){
            return series;
        }
        series.add(1);
        for(int i=2; i<n; i++){
            series.add(series.get(i -1)+series.get(i -2));
        }
        return series;

    }

}
