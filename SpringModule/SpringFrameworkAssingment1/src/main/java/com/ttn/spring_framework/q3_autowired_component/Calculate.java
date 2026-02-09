package com.ttn.spring_framework.q3_autowired_component;

import com.ttn.spring_framework.q3_autowired_component.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*
Q)3)   Use @Compenent and @Autowired annotations to in Loosely Coupled code for dependency management
 */
@Component
public class Calculate {
   @Autowired
    Calculator calculator;

     public void calc(int a, int b){
         System.out.println(calculator.calculate(a,b));
    }

//    @Override
//    public String toString() {
//        return "Calculate{" +
//                "calculator=" + "Addition Operation" +
//                '}';
//    }
}
