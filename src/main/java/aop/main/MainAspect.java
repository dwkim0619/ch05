package aop.main;

import aop.chap07.Calculator;
import aop.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAspect {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Calculator calc = ctx.getBean("calculator", Calculator.class);
        long result = calc.factorial(5);
        System.out.println("calc.factorial(5) = " + result);
        System.out.println(calc.getClass().getName());

        ctx.close();
    }
}
