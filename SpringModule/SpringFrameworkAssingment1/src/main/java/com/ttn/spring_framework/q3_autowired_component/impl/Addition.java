package com.ttn.spring_framework.q3_autowired_component.impl;

import com.ttn.spring_framework.q3_autowired_component.service.Calculator;
import org.springframework.stereotype.Component;

@Component
public class Addition implements Calculator {
    public int calculate(int a, int b){
        return a+b;
    }

}
