package com.ttn.spring_framework.q6_constructor_injection;
/*
Q)6 )   Perform Constructor Injection in a Spring Bean
 */
import com.ttn.spring_framework.q6_constructor_injection.service.CalculatorQ6;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Q6MainClass {
    private CalculatorQ6 calc;

    @Autowired
    public Q6MainClass(CalculatorQ6 calc) {
        this.calc = calc;
    }

    public void showResult(){
        System.out.println("Addition= "+ calc.calculate(10,20));
    }

}
