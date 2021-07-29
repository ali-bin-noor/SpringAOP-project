package com.aop;

import com.aop.services.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/aop/config.xml");
        PaymentService paymentobject = context.getBean("payment",PaymentService.class);
        
        //auth,print:PaymentStartd
        paymentobject.makePayment();//here makepayment is join point


    
    
    }
    
}