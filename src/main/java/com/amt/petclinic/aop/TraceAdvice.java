package com.amt.petclinic.aop;

import java.time.LocalTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TraceAdvice {

	//Feedback
	@Before("execution(* com.amt.petclinic.service.impl.FeedbackServiceImpl.create(..))")
	public void beforeRequestTrace(JoinPoint joinPoint) {
		System.out.println(
				"Triggered Feedback:: " + joinPoint.getSignature().getName() + " at server time " + LocalTime.now());
	}

	@After("execution(* com.amt.petclinic.service.impl.FeedbackServiceImpl.create(..))")
	public void afterRequestTrace(JoinPoint joinPoint) {
		System.out.println(
				"Feedback Stored:: " + joinPoint.getSignature().getName() + " at server time " + LocalTime.now());
	}

	@AfterThrowing(pointcut = "execution(* com.amt.petclinic.service.impl.FeedbackServiceImpl.create(..))", throwing = "exception")
	public void beforeRequestTrace(JoinPoint joinPoint, Exception exception) {
		System.out.println("Exception Occured While Processing:: " + joinPoint.getSignature().getName()
				+ " at server time " + LocalTime.now());
		System.out.println(
				"Error Message:: " + exception.getMessage() + " \nFull StackTrace: " + exception.getStackTrace());
	}

	//Owner
	@After("execution(* com.amt.petclinic.service.impl.OwnerServiceImpl.create(..))")
	public void traceMethodAfterCreatingOwner(JoinPoint joinPoint) {
		System.out.println("Owner Registration Time: " + LocalTime.now());
	}

	//Doctor
	@After("execution(* com.amt.petclinic.service.impl.DoctorServiceImpl.create(..))")
	public void traceMethodAfterCreatingDoctor(JoinPoint joinPoint) {
		System.out.println("Doctor Registration Time: " + LocalTime.now());
	}
}
