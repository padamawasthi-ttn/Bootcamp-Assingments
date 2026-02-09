package com.ttn.spring_framework.q6_constructor_injection.impl;

import com.ttn.spring_framework.q6_constructor_injection.service.CalculatorQ6;
import org.springframework.stereotype.Component;

@Component
public class AdditionQ6 implements CalculatorQ6 {
    public int calculate(int a, int b){
        return a+b;
    }
}
