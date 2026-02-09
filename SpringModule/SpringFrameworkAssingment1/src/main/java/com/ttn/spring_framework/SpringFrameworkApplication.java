package com.ttn.spring_framework;

import com.ttn.spring_framework.q3_autowired_component.Calculate;
import com.ttn.spring_framework.q5_autowire_ambiguity.Q5MainClass;
import com.ttn.spring_framework.q6_constructor_injection.Q6MainClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args)
	{
		ApplicationContext applicationContext=SpringApplication.run(SpringFrameworkApplication.class, args);
//
//		//Q3 AUtowired_Component
//
//		Calculate calculateClassBean = applicationContext.getBean(Calculate.class);
//
//		calculateClassBean.calc(4,56);
//
//		System.out.println(calculateClassBean);


		//Q5 Autowired  Ambiguity
//
//		Q5MainClass Q5ClassBean = applicationContext.getBean(Q5MainClass.class);
//
//		Q5ClassBean.calculate(5,65);



		//Q6 Constructor injection


		Q6MainClass Q6ClassBean = applicationContext.getBean(Q6MainClass.class);

		Q6ClassBean.showResult();


	}

}
