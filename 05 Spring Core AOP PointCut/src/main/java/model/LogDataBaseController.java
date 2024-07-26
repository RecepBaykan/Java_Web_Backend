package model;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogDataBaseController {
	
	 @Before("moveList()")
	    public void listBefore() {
	        System.out.println("Listeye veri ekleniyor");
	    }
	
	 @After("moveList()")
	    public void listAfter() {
	        System.out.println("Listeye veri eklendi");
	    }
	 
	 
	 @Before("allStartMetot()")
	 public void startBefore() {
		 System.out.println("Tüm metotlar başlamak üzere");
	 }
	
	 @After("allStartMetot()")
	 public void startAfter() {
		 System.out.println("Tüm metotlar başladı");
	 }
	 
	 
	 @Before("allStartModel()")
	 public void startBeforeModel() {
		 System.out.println("Tüm Model paketinin içindeki metotlar başlamak üzere");
	 }
	
	 @After("allStartModel()")
	 public void startAfterModel() {
		 System.out.println("Tüm Model paketinin içindeki metotlar metotlar başladı");
	 }
	 
	
	/*
	 * 
	 * 
	 * Bir nevi class tanımlama yöntemi
	 * 
	 * */
	 
	 @Pointcut("execution (* controller.DataBaseController.moveList(..))")
	 public void moveList() {
		 
	 }
	
	 @Pointcut("within (*)")
	 public void allStartMetot() {
		 
		// Tüm metotların başlangıcı ve sonrasını çalıştırır
	 }
	 
	 
	 @Pointcut("within (model.*)")
	 public void allStartModel() {
		 
		// Model paketinin içindeki tüm metotlar başlar
		 /*
		 	Not: sınıfı içine de indirgenir böyle ama sağlıklı bir durum değil tabi.
		 */
		 
		 
	 }
	 
	 
	 /*
	  * 
	  * 
	  * @Pointcut(com.adres())
	  * void metod()
	  * 
	  *	
	  * @Before(metod())
	  * 
	  * 
	  */

}
