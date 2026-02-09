package com.ttn.spring_framework.q5_autowire_ambiguity.impl;

import com.ttn.spring_framework.q5_autowire_ambiguity.service.CalculatorQ5;
import org.springframework.stereotype.Component;

@Component
public class AdditionQ5 implements CalculatorQ5 {
    public int calculate(int a, int b) {
        return a + b;
    }
}