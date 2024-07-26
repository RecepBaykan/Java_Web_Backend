package model;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogDataBaseController {
	
	 @AfterReturning(pointcut = "execution (* controller.DataBaseController.moveList(..))", returning = "list")
	    public void list(JoinPoint jp, List list) {
	       	
		 	System.out.println("--------------");
		 	
		 	Student student = (Student) list.get(0);
		 	System.out.println(student.getName());
		 	System.out.println("--------------");
		 	
	    }
	

	

}
