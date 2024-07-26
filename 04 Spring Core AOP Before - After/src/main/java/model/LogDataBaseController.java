package model;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogDataBaseController {
	
	 @Before("execution(* moveList(..))")
	    public void listBefore() {
	        System.out.println("Listeye veri ekleniyor");
	    }
	
	 @After("execution(* moveList(..))")
	    public void listAfter() {
	        System.out.println("Listeye veri eklendi");
	    }
	
	
	
	
	

}
