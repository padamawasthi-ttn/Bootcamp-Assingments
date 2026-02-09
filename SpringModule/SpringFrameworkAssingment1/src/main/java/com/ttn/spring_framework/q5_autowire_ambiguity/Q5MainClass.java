package com.ttn.spring_framework.q5_autowire_ambiguity;
/*
Demonstrate how you will resolve ambiguity while autowiring bean
 */
import com.ttn.spring_framework.q5_autowire_ambiguity.service.CalculatorQ5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Q5MainClass {

    @Autowired
    @Qualifier("additionQ5")
    CalculatorQ5 calculator;

    public void calculate(int a, int b){
        System.out.println(calculator.calculate(a,b));
    }
}
