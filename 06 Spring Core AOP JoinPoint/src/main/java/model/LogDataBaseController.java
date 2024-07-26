package model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogDataBaseController {
	
	 @Before("moveList()")
	    public void listBefore(JoinPoint jp) {
	        System.out.println("İşlem başlıyor: " + jp.toString());
	        System.out.println("işlem türü: " + jp.getKind());
	        System.out.println("Metot imzası/adresi: " + jp.getSignature());
	        System.out.println("Class: " +jp.getTarget());
	        System.out.println("----------------------------------");
	    }
	
	 @After("moveList()")
	    public void listAfter(JoinPoint jp) {
		 System.out.println("İşlem bitti: " + jp.toString());
		 System.out.println("işlem türü: " + jp.getKind());
		 System.out.println("Metot imzası/adresi: " + jp.getSignature());
		 System.out.println("Class: " +jp.getTarget());
	        System.out.println("----------------------------------");
	    }
	 

	 
	 @Pointcut("within (*)")
	 public void moveList() {
		 
	 }
	

	

}
