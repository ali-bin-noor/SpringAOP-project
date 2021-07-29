package com.aop.aspect;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@Aspect niche wala @Aspect hona chahiye
@EnableAspectJAutoProxy
public class MyAspect 
{
	@Before("execution(* com.aop.services.PaymentServiceImpl.makePayment(..)")
	public void printBefore() 
	{
		System.out.println("Paymnet Started");
		
	}
	
	@After("execution(* com.aop.services.PaymentServiceImpl.makePayment(..)")
	public void printAfter() 
	{
		System.out.println("Paymnet Done");
		
	}
	
}
